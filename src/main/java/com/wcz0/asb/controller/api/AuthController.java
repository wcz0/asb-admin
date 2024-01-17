package com.wcz0.asb.controller.api;


import com.wcz0.asb.service.dao.UserDao;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wcz0
 */
@RestController("ApIAuthController")
@RequestMapping("admin-api")
@Tag(name="用户认证")
public class AuthController {

    @Autowired
    private UserDao userDao;

//    @PostMapping("login")
//    @Operation(summary = "登录")
//    public Result<LoginResponse> login(@Validated @RequestBody LoginRequest request) {
//        return Result.success(userService.login(request));
//    }
//
//    @PostMapping(value="register", consumes = "multipart/form-data")
//    @Operation(summary = "注册")
//    public Result<LoginResponse> register(@Validated @ModelAttribute RegisterRequest request) {
//        return Result.success(userService.register(request));
//    }
}
