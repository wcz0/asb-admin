package com.wcz0.asb.service;

import com.wcz0.asb.enums.ExceptionCodeEnum;
import com.wcz0.asb.response.Result;

/**
 * @author wcz0
 */
public class BaseService {

    public <T> Result<?> success(T data){
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), ExceptionCodeEnum.SUCCESS.getMsg(), data);
    }

    public <T> Result<?> success(String string){
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), string, null);
    }

    public <T> Result<?> success(String string, T data){
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), string, data);
    }

    public Result<?> failed(String message){
        return new Result<>(ExceptionCodeEnum.FAILED.getStatus(), message, null);
    }
}
