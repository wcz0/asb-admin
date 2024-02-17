package com.wcz0.asb.config;

import com.wcz0.asb.interceptor.AdminCasbinInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wcz0
 */
@Configuration
public class AdminCasbinConfig implements WebMvcConfigurer {

    @Autowired
    private AdminCasbinInterceptor adminCasbinInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(adminCasbinInterceptor)
                .addPathPatterns("/admin-api/**")
                // 基础不需要鉴权的路由
                .excludePathPatterns("/admin-api/menus")
                .excludePathPatterns("/admin-api/user_setting")
                .excludePathPatterns("/admin-api/current_user")
                // 公共
                .excludePathPatterns("/admin-api/login")
                .excludePathPatterns("/admin-api/register")
                .excludePathPatterns("/admin-api/logout")
                .excludePathPatterns("/admin-api/_settings")
                .excludePathPatterns("/admin-api/_download_export")
                .excludePathPatterns("/admin-api/captcha")
                .excludePathPatterns("/admin-api/no-content");
    }
}
