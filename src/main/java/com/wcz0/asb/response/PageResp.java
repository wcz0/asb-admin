package com.wcz0.asb.response;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
 * @author wcz0
 */
public class PageResp<T> extends Page<T> {

    private List<T> items;
    private Long total;

    public PageResp(){
        super();
    }



}
