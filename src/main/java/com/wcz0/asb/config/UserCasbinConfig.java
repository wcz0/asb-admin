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
public class UserCasbinConfig implements WebMvcConfigurer {

    @Autowired
    private CasbinInterceptor casbinInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(casbinInterceptor)
                .addPathPatterns("/api/**");
    }
}
