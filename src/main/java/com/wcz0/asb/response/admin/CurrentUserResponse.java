package com.wcz0.asb.response.admin;

import lombok.Data;

/**
 * @author wcz0
 */
@Data
public class CurrentUserResponse {
    private String name;
    private String avatar;
    private Object menus;
}
