package com.wcz0.asb.service;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcz0.asb.exception.BaseException;
import com.wcz0.asb.mapper.AdminUserMapper;
import com.wcz0.asb.model.AdminUser;
import com.wcz0.asb.request.admin.LoginRequest;
import com.wcz0.asb.request.admin.RegisterRequest;
import com.wcz0.asb.response.admin.LoginResponse;
import org.springframework.stereotype.Service;

/**
 * @author wcz0
 */
@Service
public class AdminUserService extends ServiceImpl<AdminUserMapper, AdminUser> implements IService<AdminUser> {

    public LoginResponse login(LoginRequest loginRequest) {
        QueryWrapper<AdminUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", loginRequest.getUsername());
        AdminUser adminUser = getOne(queryWrapper);
        if (adminUser == null) {
            throw new BaseException("用户不存在");
        }
        if (!BCrypt.checkpw(loginRequest.getPassword(), adminUser.getPassword())) {
            throw new BaseException("密码错误");
        }
        StpUtil.login(adminUser.getId());
        return new LoginResponse().setToken(StpUtil.getTokenValue());

    }

    public LoginResponse register(RegisterRequest registerRequest) {
        QueryWrapper<AdminUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", registerRequest.getUsername());
        AdminUser adminUser = getOne(queryWrapper);
        if (adminUser != null) {
            throw new BaseException("用户已存在");
        }
        String hashedPwd =  BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt());
        adminUser = new AdminUser();
        adminUser.setUsername(registerRequest.getUsername());
        adminUser.setPassword(hashedPwd);
        adminUser.setName(registerRequest.getName());
        save(adminUser);
        StpUtil.login(adminUser.getId());
        return new LoginResponse().setToken(StpUtil.getTokenValue());
    }
}
