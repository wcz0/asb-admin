package com.wcz0.asb.config;

import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wcz0
 */
@Configuration
public class AdminAuthConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SaInterceptor(handle -> StpUtil.checkLogin()))
                .addPathPatterns("/admin-api/**")
                .excludePathPatterns("/admin-api/login")
                .excludePathPatterns("/admin-api/register")
                .excludePathPatterns("/admin-api/logout")
                .excludePathPatterns("/admin-api/_settings")
                .excludePathPatterns("/admin-api/_download_export")
                .excludePathPatterns("/admin-api/captcha")
                .excludePathPatterns("/admin-api/no-content");
    }
}
