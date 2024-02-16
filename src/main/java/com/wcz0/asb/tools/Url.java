package com.wcz0.asb.tools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wcz0
 */
@Component
public class Url {

    @Value("${website.url}")
    private String url;

    public String get(String url) {
        return this.url + url;
    }


    public String get(){
        return this.url;
    }

    /**
     * 获取后台接口地址
     * @param url String
     * @return String
     */
    public String getAdmin(String url){
        return this.url + "/admin-api" + url;
    }

    public String getAdmin(){
        return this.url + "/admin-api";
    }

    /**
     * 上传图片地址
     * @return
     */
    public String uploadImageUrl(){
        return this.url + "/admin-api/upload_image";
    }

    public String uploadFileUrl(){
        return this.url + "/admin-api/upload_file";
    }
}
