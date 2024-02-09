package com.wcz0.asb.config;

import com.wcz0.asb.interceptor.CasbinInterceptor;
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
    private CasbinInterceptor casbinInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(casbinInterceptor)
                .addPathPatterns("/admin-api/**")
                // 基础不需要鉴权的路由
                .excludePathPatterns("/admin-api/login")
                .excludePathPatterns("/admin-api/register")
                .excludePathPatterns("/admin-api/logout")
                .excludePathPatterns("/admin-api/_settings")
                .excludePathPatterns("/admin-api/_download_export")
                .excludePathPatterns("/admin-api/captcha")
                .excludePathPatterns("/admin-api/no-content");
    }
}
