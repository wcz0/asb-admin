package com.wcz0.asb.service;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wcz0.asb.model.AdminUser;
import com.wcz0.asb.request.admin.LoginRequest;
import com.wcz0.asb.request.admin.RegisterRequest;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.response.admin.CurrentUserResponse;
import com.wcz0.asb.response.admin.LoginResponse;
import com.wcz0.asb.service.dao.AdminUserDao;
import com.wcz0.asb.tools.aims.Amis;
import com.wcz0.asb.tools.aims.AmisFactory;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wcz0
 */
@Service
public class AdminUserService extends BaseService {

    @Autowired
    private AdminUserDao adminUserDao;


    public Result<?> login(LoginRequest loginRequest) {
        QueryWrapper<AdminUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", loginRequest.getUsername());
        AdminUser adminUser = adminUserDao.getOne(queryWrapper);
        if (adminUser == null) {
            return this.failed("用户不存在");
        }
        if (!BCrypt.checkpw(loginRequest.getPassword(), adminUser.getPassword())) {
            return this.failed("密码错误");
        }
        StpUtil.login(adminUser.getId());
        return this.success(new LoginResponse().setToken(StpUtil.getTokenValue()));
    }

    public Result<?> register(RegisterRequest registerRequest) {
        QueryWrapper<AdminUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", registerRequest.getUsername());
        AdminUser adminUser = adminUserDao.getOne(queryWrapper);
        if (adminUser != null) {
            return this.failed("用户已存在");
        }
        String hashedPwd = BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt());
        adminUser = new AdminUser();
        adminUser.setUsername(registerRequest.getUsername());
        adminUser.setPassword(hashedPwd);
        adminUser.setName(registerRequest.getName());
        boolean bool = adminUserDao.save(adminUser);
        if (!bool) {
            return this.failed("注册失败");
        }
        StpUtil.login(adminUser.getId());
        return this.success(new LoginResponse().setToken(StpUtil.getTokenValue()));
    }

    public Result<?> currentUser() {
        CurrentUserResponse currentUserResponse = new CurrentUserResponse();
        // get user info
        AdminUser adminUser = adminUserDao.getById(StpUtil.getLoginIdAsLong());
        if (adminUser == null) {
            return this.failed("用户不存在");
        }
        currentUserResponse.setAvatar("http://demo.owladmin.com/admin/default-avatar.png");
        // get view
        Object menu = AmisFactory.DropdownButton()
                .hideCaret(true)
                .trigger("hover")
                .label(adminUser.getName())
                .className("h-full w-full")
                .btnClassName("navbar-user w-full")
                .menuClassName("min-w-0 p-2")
                .set("icon", "http://demo.owladmin.com/admin/default-avatar.png")
                .buttons(new Object[]{
                        AmisFactory.VanillaAction()
                                .iconClassName("pr-2")
                                .icon("fa fa-user-gear")
                                .label("用户设置")
                                .onClick("window.location.hash = '#/user_setting'"),
                        AmisFactory.VanillaAction()
                                .iconClassName("pr-2")
                                .icon("fa fa-sign-out-alt")
                                .label("退出登录")
                                .onClick("window.location.hash = '#/logout'")
                })
                .render();
        currentUserResponse.setMenus(menu);
        return this.success(currentUserResponse);
    }
}
