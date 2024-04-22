package com.wcz0.asb.controller;

/**
 * @author wcz0
 */
public class BaseController {


    public boolean actionOfGetData(String action) {
        return "getData".equals(action);
    }

    public boolean actionOfExport(String action) {
        return "export".equals(action);
    }

    public boolean actionOfQuickEdit(String action) {
        return "quickEdit".equals(action);
    }

    public boolean actionOfQuickEditItem(String action) {
        return "quickEditItem".equals(action);
    }

}