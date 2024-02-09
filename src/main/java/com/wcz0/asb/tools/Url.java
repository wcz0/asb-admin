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
}
