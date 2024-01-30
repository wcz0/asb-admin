package com.wcz0.asb.response.admin;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author wcz0
 */
@Data
public class AdminMenuResponse {
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
    private List<AdminMenuResponse> children;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
