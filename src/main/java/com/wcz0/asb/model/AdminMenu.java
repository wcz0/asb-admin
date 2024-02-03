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
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("admin_menus")
@Schema(description = "后台菜单")
@Repository
public class AdminMenu extends Model<AdminMenu> {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer parentId;
    private Integer order;
    private String title;
    private String icon;
    private String url;
    private Byte urlType;
    private Byte visible;
    private Byte isHome;
    private String component;
    private Byte isFull;
    private String extension;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
