package com.wcz0.asb.controller.admin;

/**
 * @author wcz0
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.service.AdminMenuService;
import com.wcz0.asb.service.AdminSettingService;
import com.wcz0.asb.service.AdminUserService;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("AdminIndexController")
@RequestMapping("admin-api")
public class IndexController {

    @Autowired
    AdminSettingService adminSettingService;

    @Autowired
    AdminUserService adminUserService;

    @Autowired
    AdminMenuService adminMenuService;

    @GetMapping("_settings")
    public Result settings() {
        return adminSettingService.index();
    }

    @PostMapping("_settings")
    public Result saveSettings(@NotEmpty @RequestBody Map<String, String> data) {
        return adminSettingService.store(data);
    }

    @GetMapping("no-content")
    public Result noContent() {
        return Result.success();
    }

    @GetMapping("captcha")
    public Result captcha() {
        // TODO: captcha
        return Result.success();
    }

    @GetMapping("logout")
    public Result logout() {
        return Result.success();
    }

    @GetMapping("_download_export")
    public Result login() {
        // TODO: download export
        return Result.success();
    }

    @GetMapping("current-user")
    public Result currentUser() {
        return adminUserService.currentUser();
    }

    @GetMapping("menus")
    public Result menus() {
        return adminMenuService.getMenus();
    }

    @PutMapping("user_setting")
    public Result userSetting(@JsonInclude(JsonInclude.Include.NON_NULL) @RequestBody Map<String, String> data) {
        return adminUserService.userSetting(data);
    }

}
