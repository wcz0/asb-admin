package com.wcz0.asb.controller.admin;

import com.wcz0.asb.controller.BaseController;
import com.wcz0.asb.request.admin.LoginRequest;
import com.wcz0.asb.request.admin.RegisterRequest;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author wcz0
 */
@RestController("AdminAuthController")
@RequestMapping("admin-api")
public class AuthController extends BaseController {

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("login")
    public Result login(@Validated @RequestBody LoginRequest request) {
        return adminUserService.login(request);
    }

    @PostMapping(value = "register", consumes = "multipart/form-data")
    public Result register(@Validated @ModelAttribute RegisterRequest request) {
        return adminUserService.register(request);
    }
}
