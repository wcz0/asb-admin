package com.wcz0.asb.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @author wcz0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("users")
@Schema(description = "用户")
public class User extends Model<User> {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String avatar;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
