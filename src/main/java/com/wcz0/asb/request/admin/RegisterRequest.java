package com.wcz0.asb.request.admin;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;


/**
 * @author wcz0
 */
@Data
@Accessors(chain = true)
public class RegisterRequest implements Serializable {

    @NotBlank(message = "账号 不能为空")
    @Length(max = 32, message = "账号长度不能超过32个字符")
    private String username;

    @NotBlank(message = "密码 不能为空")
    @Length(min = 6, max = 30 ,message = "密码长度在6-30个字符")
    private String password;

    @NotBlank(message = "名字 不能为空")
    @Length(max = 32, message = "名字长度不能超过32个字符")
    private String name;
}
