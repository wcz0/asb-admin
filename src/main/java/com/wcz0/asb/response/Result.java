package com.wcz0.asb.response;

import com.wcz0.asb.enums.ExceptionCodeEnum;
import com.wcz0.asb.exception.ExceptionHandler;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author wcz0
 */
@Data
public class Result<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private long code;
    private String message;
    private T data;

    protected Result() {
    }

    public Result(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getCode(), ExceptionCodeEnum.SUCCESS.getMessage(), null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getCode(), ExceptionCodeEnum.SUCCESS.getMessage(), data);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getCode(), message, data);
    }

    public static <T> Result<T> success(long code, String message, T data) {
        return new Result<>(code, message, data);
    }

    public static <T> Result<T> failed() {
        return new Result<>(ExceptionCodeEnum.FAILED.getCode(), ExceptionCodeEnum.FAILED.getMessage(), null);
    }

    public static <T> Result<T> failed(String message) {
        return new Result<>(ExceptionCodeEnum.FAILED.getCode(), message, null);
    }

    public static <T> Result<T> failed(long code, String message) {
        return new Result<>(code, message, null);
    }

    public static <T> Result<T> failed(long code, String message, T data) {
        return new Result<>(code, message, data);
    }

    public static <T> Result<T> failed(ExceptionHandler exceptionHandler) {
        return new Result<>(exceptionHandler.getCode(), exceptionHandler.getMessage(), null);
    }

    public static <T> Result<T> failed(ExceptionHandler exceptionHandler, T data) {
        return new Result<>(exceptionHandler.getCode(), exceptionHandler.getMessage(), data);
    }

    public static <T> Result<T> failed(ExceptionHandler exceptionHandler, String message) {
        return new Result<>(exceptionHandler.getCode(), message, null);
    }

    public static <T> Result<T> failed(ExceptionHandler exceptionHandler, String message, T data) {
        return new Result<>(exceptionHandler.getCode(), message, data);
    }






}
