package com.wcz0.asb.response.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wcz0
 */
@Data
@Accessors(chain = true)
@Schema(description = "登录响应")
public class LoginResponse implements Serializable{
    @Schema(description = "token")
    private String token;
}
