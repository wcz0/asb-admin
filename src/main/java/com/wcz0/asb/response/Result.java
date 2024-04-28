package com.wcz0.asb.response;

import com.wcz0.asb.enums.ExceptionCodeEnum;
import com.wcz0.asb.exception.ExceptionHandler;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author wcz0
 */
@Data
public class Result<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private int status;
    private int code;
    private String msg;
    private T data;

    protected Result() {
    }

    public Result(int status, int code, String msg, T data) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), ExceptionCodeEnum.SUCCESS.getCode(),
                ExceptionCodeEnum.SUCCESS.getMsg(), null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), ExceptionCodeEnum.SUCCESS.getCode(),
                ExceptionCodeEnum.SUCCESS.getMsg(), data);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), ExceptionCodeEnum.SUCCESS.getCode(), message, data);
    }

    public static <T> Result<T> success(int code, String message, T data) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), code, message, data);
    }

    public static Result<List<Map<String, Object>>> success(List<Map<String, Object>> data) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getStatus(), ExceptionCodeEnum.SUCCESS.getCode(),
                ExceptionCodeEnum.SUCCESS.getMsg(), data);
    }

    public static <T> Result<T> failed() {
        return new Result<>(ExceptionCodeEnum.FAILED.getStatus(), ExceptionCodeEnum.FAILED.getCode(),
                ExceptionCodeEnum.FAILED.getMsg(), null);
    }

    public static <T> Result<T> failed(String message) {
        return new Result<>(ExceptionCodeEnum.FAILED.getStatus(), ExceptionCodeEnum.FAILED.getCode(), message, null);
    }

    public static <T> Result<T> failed(int code, String message) {
        return new Result<>(ExceptionCodeEnum.FAILED.getStatus(), code, message, null);
    }

    public static <T> Result<T> failed(int code, String message, T data) {
        return new Result<>(ExceptionCodeEnum.FAILED.getStatus(), code, message, data);
    }

    public static <T> Result<T> failed(ExceptionHandler exceptionHandler) {
        return new Result<>(exceptionHandler.getStatus(), ExceptionCodeEnum.FAILED.getCode(), exceptionHandler.getMsg(),
                null);
    }

    public static <T> Result<T> failed(ExceptionHandler exceptionHandler, T data) {
        return new Result<>(exceptionHandler.getStatus(), ExceptionCodeEnum.FAILED.getCode(), exceptionHandler.getMsg(),
                data);
    }

    public static <T> Result<T> failed(ExceptionHandler exceptionHandler, String message) {
        return new Result<>(exceptionHandler.getStatus(), ExceptionCodeEnum.FAILED.getCode(), message, null);
    }

    public static <T> Result<T> failed(ExceptionHandler exceptionHandler, String message, T data) {
        return new Result<>(exceptionHandler.getStatus(), ExceptionCodeEnum.FAILED.getCode(), message, data);
    }

}
