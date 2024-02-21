package com.wcz0.asb.controller.admin;

/**
 * @author wcz0
 */
public class BaseController {


    public boolean actionOfGetData(String action) {
        return action.equals("getData");
    }

    public boolean actionOfExport(String action) {
        return action.equals("export");
    }

    public boolean actionOfQuickEdit(String action) {
        return action.equals("quickEdit");
    }

    public boolean actionOfQuickEditItem(String action) {
        return action.equals("quickEditItem");
    }

}
