package com.wcz0.asb.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;


/**
 * @author wcz0
 */
//@EqualsAndHashCode(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("admin_users")
@Schema(description = "后台用户")
@Repository
public class AdminUser extends Model<AdminUser> {
    @TableId(type = IdType.AUTO)
    @Schema(description = "用户ID")
    private Integer id;
    @Schema(description = "用户名")
    private String username;
    @Schema(description = "密码")
    private String password;
    @Schema(description = "名字")
    private String name;
    @Schema(description = "头像")
    private String avatar;
    @Schema(description = "角色")
    private String rememberToken;
    @Schema(description = "创建时间")
    private LocalDateTime createdAt;
    @Schema(description = "更新时间")
    private LocalDateTime updatedAt;
}
