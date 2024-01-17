package com.wcz0.asb.service;

import com.wcz0.asb.enums.ExceptionCodeEnum;
import com.wcz0.asb.response.Result;

/**
 * @author wcz0
 */
public class BaseService {

    public <T> Result<?> success(T data){
        return new Result<>(ExceptionCodeEnum.SUCCESS.getCode(), ExceptionCodeEnum.SUCCESS.getMessage(), data);
    }

    public <T> Result<?> success(String string){
        return new Result<>(ExceptionCodeEnum.SUCCESS.getCode(), string, null);
    }

    public <T> Result<?> success(String string, T data){
        return new Result<>(ExceptionCodeEnum.SUCCESS.getCode(), string, data);
    }

    public Result<?> failed(String message){
        return new Result<>(ExceptionCodeEnum.FAILED.getCode(), message, null);
    }
}
