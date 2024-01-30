package com.wcz0.asb.controller.admin;

import com.wcz0.asb.service.AdminMenuService;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wcz0
 */
@RestController("AdminMenuController")
@RequestMapping("admin-api/system/admin_menus")
public class MenuController {

    @Autowired
    AdminMenuService adminMenuService;

    @GetMapping("")
    public String index() {
        return "admin_menus";
    }

    @PostMapping("")
    public String store() {
        return "admin_menus";
    }

    @GetMapping("{id}")
    public String show() {
        return "admin_menus";
    }

    @PutMapping("{id}")
    public String update() {
        return "admin_menus";
    }

    @DeleteMapping("{id}")
    public String destroy() {
        return "admin_menus";
    }
}
