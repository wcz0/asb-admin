package com.wcz0.asb.controller.admin;

import com.wcz0.asb.response.Result;
import com.wcz0.asb.service.AdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wcz0
 */
@RestController("AdminRoleController")
@RequestMapping("admin-api/system/admin_roles")
public class RoleController extends BaseController {

    @Autowired
    AdminRoleService adminRoleService;

    @GetMapping("")
    public Result list(@RequestParam(value = "_action", required = false) String action) {
        if (actionOfGetData(action)) {
            return adminRoleService.index();
        }else {
            return adminRoleService.indexView();
        }
    }
}
