package com.wcz0.asb.request.admin;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author wcz0
 */
@Data
public class UserSettingRequest {
    private String avatar;
    private String name;
    private String oldPassword;
    private String password;
    private String confirmPassword;
}
