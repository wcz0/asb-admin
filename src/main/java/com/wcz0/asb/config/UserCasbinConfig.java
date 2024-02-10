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
public class UserCasbinConfig implements WebMvcConfigurer {

    @Autowired
    private AdminCasbinInterceptor adminCasbinInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(adminCasbinInterceptor)
                .addPathPatterns("/api/**");
    }
}
