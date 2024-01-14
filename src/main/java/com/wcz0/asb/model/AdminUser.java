package com.wcz0.asb.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;


/**
 * @author wcz0
 */
//@EqualsAndHashCode(callSuper = true)
@Data
@TableName("admin_users")
public class AdminUser extends Model<AdminUser> {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String avatar;
    private String rememberToken;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
