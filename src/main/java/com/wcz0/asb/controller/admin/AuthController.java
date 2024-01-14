package com.wcz0.asb.controller.admin;

import com.wcz0.asb.request.admin.LoginRequest;
import com.wcz0.asb.request.admin.RegisterRequest;
import com.wcz0.asb.response.admin.LoginResponse;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.service.AdminUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author wcz0
 */
@Slf4j
@RestController("AdminAuthController")
@RequestMapping("admin-api")
public class AuthController {
    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("login")
    public Result<LoginResponse> login(@Validated @RequestBody LoginRequest request) {
        return Result.success(adminUserService.login(request));
    }

    @PostMapping(value="register", consumes = "multipart/form-data")
    public Result<LoginResponse> register(@Validated @RequestBody RegisterRequest request) {
        return Result.success(adminUserService.register(request));
    }
}
