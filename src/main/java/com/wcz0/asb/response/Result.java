package com.wcz0.asb.response;

import com.wcz0.asb.exception.ExceptionCodeEnum;
import com.wcz0.asb.exception.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author wcz0
 */
public class Result<T> {
    private long code;
    private String message;
    private T data;

    protected Result() {
    }

    protected Result(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> Result<T> success() {
        return new Result<T>(ExceptionCodeEnum.SUCCESS.getCode(), ExceptionCodeEnum.SUCCESS.getMessage(), null);
    }

    public static <T> Result<T> success(String message) {
        return new Result<T>(ExceptionCodeEnum.SUCCESS.getCode(), message, null);
    }


    public static <T> Result<T> success(T data) {
        return new Result<T>(ExceptionCodeEnum.SUCCESS.getCode(), ExceptionCodeEnum.SUCCESS.getMessage(), data);
    }

    public static Result<Map<String, Object>> success(MyRecord record) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getCode(), ExceptionCodeEnum.SUCCESS.getMessage(), record.getColumns());
    }

    /**
     * 成功返回结果
     *
     * @param recordList 获取的数据
     */
    public static CommonResult<List<Map<String, Object>>> success(List<MyRecord> recordList) {
        List<Map<String, Object>> list = new ArrayList<>();
        recordList.forEach(i -> {
            list.add(i.getColumns());
        });
        return new CommonResult<>(ExceptionCodeEnum.SUCCESS.getCode(), ExceptionCodeEnum.SUCCESS.getMessage(), list);
    }

    public static <T> Result<T> success(T data, String message) {
        return new Result<>(ExceptionCodeEnum.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> Result<T> failed(ExceptionHandler errorCode) {
        System.out.println("errorCode1:" + errorCode);
        return new Result<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param message 错误信息
     */
    public static <T> Result<T> failed(ExceptionHandler errorCode,String message) {
        System.out.println("errorCode2:" + errorCode);
        return new Result<T>(errorCode.getCode(), message, null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> Result<T> failed(String message) {
        return new Result<T>(ExceptionCodeEnum.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> Result<T> failed() {
        return failed(String.valueOf(ExceptionCodeEnum.FAILED));
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> Result<T> validateFailed() {
        return failed(ExceptionCodeEnum.VALIDATE_FAILED);
    }

    private static <T> Result<T> failed(ExceptionCodeEnum ExceptionCodeEnum) {
        return null;
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> Result<T> validateFailed(String message) {
        return new Result<T>(ExceptionCodeEnum.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> Result<T> unauthorized(T data) {
        return new Result<T>(ExceptionCodeEnum.UNAUTHORIZED.getCode(), ExceptionCodeEnum.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未登录返回结果
     */
    public static <T> Result<T> unauthorized() {
        return new Result<T>(ExceptionCodeEnum.UNAUTHORIZED.getCode(), ExceptionCodeEnum.UNAUTHORIZED.getMessage(), null);
    }

    /**
     * 没有权限查看
     */
    public static <T> Result<T> forbidden() {
        return new Result<T>(ExceptionCodeEnum.FORBIDDEN.getCode(), ExceptionCodeEnum.FORBIDDEN.getMessage(), null);
    }

    /**
     * 未授权返回结果
     */
    public static <T> Result<T> forbidden(T data) {
        return new Result<T>(ExceptionCodeEnum.FORBIDDEN.getCode(), ExceptionCodeEnum.FORBIDDEN.getMessage(), data);
    }

}
