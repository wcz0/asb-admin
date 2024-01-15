package com.wcz0.asb.controller.admin;

import com.wcz0.asb.request.admin.LoginRequest;
import com.wcz0.asb.request.admin.RegisterRequest;
import com.wcz0.asb.response.admin.LoginResponse;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.service.AdminUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
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
@Tag(name="后台认证")
public class AuthController {

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("login")
    @Operation(summary = "登录")
    public Result<LoginResponse> login(@Validated @RequestBody LoginRequest request) {
        return Result.success(adminUserService.login(request));
    }

    @PostMapping(value="register", consumes = "multipart/form-data")
    @Operation(summary = "注册")
    public Result<LoginResponse> register(@Validated @ModelAttribute RegisterRequest request) {
        return Result.success(adminUserService.register(request));
    }
}
