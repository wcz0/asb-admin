package com.wcz0.asb.filter;

import cn.dev33.satoken.stp.StpUtil;
import com.wcz0.asb.exception.CasbinException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.casbin.casdoor.entity.Enforcer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * @author wcz0
 */
@Component
public class CasbinFilter implements Filter {

    @Autowired
    private Enforcer enforcer;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String uid = StpUtil.getLoginIdAsString();
        HttpServletRequest req = (HttpServletRequest) request;
        String path = req.getServletPath();
        String method = req.getMethod();
        if (enforcer.enforce("admin", path, method)) {
            chain.doFilter(request, response);
        }else{
            throw new CasbinException();
        }
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
