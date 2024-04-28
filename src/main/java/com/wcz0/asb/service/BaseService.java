package com.wcz0.asb.service;

import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import com.wcz0.asb.enums.ExceptionCodeEnum;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.tools.Url;
import com.wcz0.asb.tools.aims.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wcz0
 */
public class BaseService {

    @Autowired
    protected Url url;

    public <T> List<String> getTableColumns(Class<T> modelClass) {
        TableInfo tableInfo = TableInfoHelper.getTableInfo(modelClass);
        if (tableInfo == null) {
            throw new RuntimeException("获取表信息失败");
        }
        List<TableFieldInfo> tableFieldInfos = tableInfo.getFieldList();
        return tableFieldInfos.stream().map(TableFieldInfo::getColumn).toList();
    }

    protected CRUDTable baseCrud() {
        return new CRUDTable()
                .perPage(20)
                .affixHeader(false)
                .filterTogglable()
                .filterDefaultVisible(false)
                // 设置主键
                .perPageAvailable(new Integer[] { 10, 20, 30, 50, 100, 200 })
                .footerToolbar(new String[] { "switch-per-page", "statistics", "pagination" })
                .headerToolbar(new Object[] {
                        this.createButton(),
                        "bulkActions",
                        amis("reload"),
                        amis("filter-toggler"),
                });
    }

    /**
     * 创建按钮
     * TODO: 没有处理url链接
     * TODO: 没有form表单
     *
     * @param dialog
     * @param dialogSize
     * @return
     */
    public Object createButton(boolean dialog, String dialogSize) {
        if (dialog) {
            return new DialogAction()
                    .dialog(new Dialog()
                            .title("新增")
                            .size(dialogSize));
        } else {
            return new LinkAction()
                    .label("新增")
                    .icon("fa fa-plus")
                    .level("primary");
        }
    }

    /**
     * 创建按钮
     * TODO: 没有处理url链接
     *
     * @return
     */
    public LinkAction createButton() {
        return new LinkAction()
                .label("新增")
                .icon("fa fa-plus")
                .level("primary");
    }

    /**
     * amis方法, 用于创建amis组件
     *
     * @param type
     * @return
     */
    public Object amis(String type) {
        return new Component().setType(type);
    }

}
