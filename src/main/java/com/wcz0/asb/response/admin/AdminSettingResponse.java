package com.wcz0.asb.response.admin;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;

/**
 * @author wcz0
 */
@Data
public class AdminSettingResponse {

    private String app_name;
    private Assets assets;
    private Layout layout;
    private String locale = "zh_CN";
    // 浏览器标题
    private Nav nav = new Nav();
    // logo
    private String logo;

    private boolean login_captcha = false;
    private boolean show_development_tools = false;
    private Object system_theme_setting = true;
    private ArrayList<String> enabled_extensions;

    @Data
    public static class Assets {
        private String[] js = new String[0];
        private String[] css = new String[0];
        private String[] scripts = new String[0];
        private String[] styles = new String[0];
    }

    @Data
    public static class Layout {

        private String title = "%title% - Asb admin ";
        private String footer = "<a href=\\\"https://github.com/wcz0/asb-admin\\\" target=\\\"_blank\\\">Asb Admin</a>";
        private Header header = new Header();
        private String[] keep_alive_exclude;

        @Data
        public static class Header {
            // 是否显示刷新 按钮
            private boolean refresh = true;
            // 是否显示黑暗模式 按钮
            private boolean dark = true;
            private boolean full_screen = false;
            private boolean theme_config = true;
        }
    }

    @Data
    public static class Nav {
        private Object appendNav;
        private Object prependNav;
    }

    public AdminSettingResponse() {
        this.nav = new Nav();
        this.assets = new Assets();
        this.layout = new Layout();
    }
}




