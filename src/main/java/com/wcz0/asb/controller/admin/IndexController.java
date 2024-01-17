package com.wcz0.asb.controller.admin;

/**
 * @author wcz0
 */

import com.wcz0.asb.response.Result;
import com.wcz0.asb.service.AdminSettingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("AdminIndexController")
@RequestMapping("admin-api")
public class IndexController {

    @Autowired
    AdminSettingService adminSettingService;

    @GetMapping("_settings")
    public Result settings() {
        return Result.success();
    }

    @PostMapping("_settings")
    public Result saveSettings(@NotEmpty @RequestBody Map<String, String> data) {
        return adminSettingService.store(data);
    }
}
