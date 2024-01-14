package com.wcz0.asb.response.admin;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wcz0
 */
@Data
@Accessors(chain = true)
public class LoginResponse implements Serializable{
    private String token;
}
