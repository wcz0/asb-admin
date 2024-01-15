package com.wcz0.asb.request.admin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import java.io.Serial;
import java.io.Serializable;


/**
 * @author wcz0
 */
@Data
@Accessors(chain = true)
@Schema(description = "注册请求")
public class RegisterRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @NotBlank(message = "账号 不能为空")
    @Length(max = 32, message = "账号长度不能超过32个字符")
    @Schema(description = "账号")
    private String username;

    @Schema(description = "密码")
    @NotBlank(message = "密码 不能为空")
    @Length(min = 6, max = 30 ,message = "密码长度在6-30个字符")
    private String password;

    @NotBlank(message = "名字 不能为空")
    @Length(max = 32, message = "名字长度不能超过32个字符")
    @Schema(description = "名字")
    private String name;
}
