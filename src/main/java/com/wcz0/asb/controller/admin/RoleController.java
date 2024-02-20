package com.wcz0.asb.controller.admin;

import com.wcz0.asb.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wcz0
 */
@RestController("AdminRoleController")
@RequestMapping("admin-api/system/admin_roles")
public class RoleController {

    @GetMapping("")
    public Result list() {
        return Result.success();
    }
}
