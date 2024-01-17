package com.wcz0.asb.model;

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
@TableName("admin_settings")
@Schema(description = "后台设置")
public class AdminSetting extends Model<AdminSetting> {
    private String key;
    private String values;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
