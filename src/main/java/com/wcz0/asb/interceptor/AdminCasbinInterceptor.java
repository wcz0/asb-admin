package com.wcz0.asb.interceptor;

import cn.dev33.satoken.stp.StpUtil;
import com.wcz0.asb.exception.CasbinException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.casbin.jcasbin.main.Enforcer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wcz0
 */
@Component
@Slf4j
public class AdminCasbinInterceptor implements HandlerInterceptor {

    @Autowired
    private Enforcer enforcer;

    private static final Pattern PATTERN = Pattern.compile("/(\\w+)/\\d+");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uid = StpUtil.getLoginIdAsString();

        String path = request.getServletPath();
        Matcher matcher = PATTERN.matcher(path);
        if (matcher.find()) {
            path = "/" + matcher.group(1) + "/{id}";
        }
        String method = request.getMethod();
        // 超级管理员
        if("1".equals(uid)){
            return true;
        }
        if (enforcer.enforce(uid, path, method)) {
            return true;
        }else{
            log.error("权限不足:"+uid+" | "+path+" | "+method);
            throw new CasbinException();
        }
    }
}
