package com.wcz0.asb.service;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.wcz0.asb.model.AdminUser;
import com.wcz0.asb.request.admin.LoginRequest;
import com.wcz0.asb.request.admin.RegisterRequest;
import com.wcz0.asb.request.admin.UserSettingRequest;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.response.admin.CurrentUserResponse;
import com.wcz0.asb.response.admin.LoginResponse;
import com.wcz0.asb.service.dao.AdminUserDao;
import com.wcz0.asb.tools.Url;
import com.wcz0.asb.tools.aims.AmisFactory;
import com.wcz0.asb.tools.aims.Form;
import com.wcz0.asb.tools.aims.ImageControl;
import com.wcz0.asb.tools.aims.TextControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * @author wcz0
 */
@Service
public class AdminUserService extends BaseService {

    @Autowired
    private AdminUserDao adminUserDao;

    @Autowired
    private AdminUser adminUser;

    @Autowired
    private Url url;


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
                                .onClick("window.location.hash = \"#/user_setting\"")
                                .render(),
                        AmisFactory.VanillaAction()
                                .iconClassName("pr-2")
                                .icon("fa fa-sign-out-alt")
                                .label("退出登录")
                                .onClick("window.location.hash = \"#/logout\"")
                                .render()
                })
                .render();
        currentUserResponse.setMenus(menu);
        return this.success(currentUserResponse);
    }

    public Result<?> saveUserSetting(UserSettingRequest request) {
        AdminUser adminUser = adminUserDao.getById(StpUtil.getLoginIdAsLong());
        if (adminUser == null) {
            return this.failed("用户不存在");
        }
        if (!StringUtils.hasText(request.getPassword()) && !StringUtils.hasText(request.getOldPassword()) && !StringUtils.hasText(request.getConfirmPassword())) {
            String password = request.getPassword();
            String oldPassword = request.getOldPassword();
            String confirmPassword = request.getConfirmPassword();
            if (password != null && oldPassword != null) {
                if (!BCrypt.checkpw(oldPassword, adminUser.getPassword())) {
                    return this.failed("原密码错误");
                }
                if (!password.equals(confirmPassword)) {
                    return this.failed("两次密码不一致");
                }
                String hashedPwd = BCrypt.hashpw(password, BCrypt.gensalt());
                adminUser.setPassword(hashedPwd);
            }
        }
        if (StringUtils.hasText(request.getAvatar())) {
            adminUser.setAvatar(request.getAvatar());
        }
        if (StringUtils.hasText(request.getName())) {
            adminUser.setName(request.getName());
        }
        adminUser.setUpdatedAt(LocalDateTime.now());
        return adminUserDao.updateById(adminUser)
                ? Result.success("用户设置保存成功")
                : Result.failed("用户设置保存失败");
    }

    public Result getUserSetting() {
        QueryWrapper<AdminUser> queryWrapper = new QueryWrapper<AdminUser>()
                .select("id", "name", "avatar", "");
        AdminUser adminUser = adminUserDao.getById(StpUtil.getLoginIdAsLong());
        if (adminUser == null) {
            return this.failed("用户不存在");
        }
        Map<String, Object> data = BeanUtils.beanToMap(adminUser);
        Form form = new Form()
                .title()
                .panelClassName("px-48 m:px-0")
                .mode("horizontal")
                .data(data)
                .api("put:" + url.getAdmin("/user_setting"))
                .body(new Object[]{
                        new ImageControl()
                                .label("头像")
                                .name("avatar")
                                .receiver(url.uploadImageUrl()),
                        new TextControl()
                                .label("用户名")
                                .name("name")
                                .required()
                                .render(),
                        new TextControl()
                                .label("原密码")
                                .name("old_password")
                                .type("password")
                                .render(),
                        new TextControl()
                                .label("新密码")
                                .name("password")
                                .type("password")
                                .render(),
                        new TextControl()
                                .label("确认密码")
                                .name("confirm_password")
                                .type("password")
                                .render()
                });
        return Result.success(form);
    }


}
