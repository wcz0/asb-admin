package com.wcz0.asb.service;

import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import com.wcz0.asb.enums.ExceptionCodeEnum;
import com.wcz0.asb.response.Result;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * @author wcz0
 */
public class BaseService {

    public <T> Result<?> success(T data) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), ExceptionCodeEnum.SUCCESS.getMsg(), data);
    }

    public <T> Result<?> success(String string) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), string, null);
    }

    public <T> Result<?> success(String string, T data) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), string, data);
    }

    public Result<?> failed(String message) {
        return new Result<>(ExceptionCodeEnum.FAILED.getStatus(), message, null);
    }

    public <T> List<String> getTableColumns(Class<T> modelClass) {
        TableInfo tableInfo = TableInfoHelper.getTableInfo(modelClass);
        if (tableInfo == null) {
            throw new RuntimeException("获取表信息失败");
        }
        List<TableFieldInfo> tableFieldInfos = tableInfo.getFieldList();
        return tableFieldInfos.stream().map(TableFieldInfo::getColumn).toList();
    }

}
