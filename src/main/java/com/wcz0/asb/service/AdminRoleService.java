package com.wcz0.asb.service;

import com.wcz0.asb.response.Result;
import com.wcz0.asb.tools.aims.*;
import org.casbin.jcasbin.main.Enforcer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wcz0
 */
@Service
public class AdminRoleService extends BaseService {

    @Autowired
    private Enforcer enforcer;

    public Result index() {
        enforcer.getAllRoles();
        return Result.success();
    }

    public Result indexView() {
        CRUDTable crud = this.baseCRUD()
                .headerToolbar(new Object[]{
                        this.createButton(),
                        "bulkActions",
                        amis("reload"),
                        amis("filter-toggler"),
                })
                .filterTogglable(false)
                .columns(new Object[]{
//                        new TableColumn().label("ID").name("id").sortable(true),
                        new TableColumn().label("角色名").name("name"),
                        new Operation()
                                .label("操作")
                                .buttons(new Object[]{
                                        this.setPermission().render(),

                        }).render()
                });

        return Result.success();
    }

    public DrawerAction setPermission(){
        return new DrawerAction()
                .label("设置权限")
                .icon("fa-solid fa-gear")
                .level("link")
                .drawer(new Drawer()
                        .title("设置权限")
                        .resizable(true)
                        .closeOnOutside(true)
                        .closeOnEsc(true)
                        .body(new Form()
                                // TODO: api没实现
                                .api(url.getAdmin("/system/admin_roles/permissions"))
                        ).render()
                );
    }
}
