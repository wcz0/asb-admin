package com.wcz0.asb.enums;

import com.wcz0.asb.exception.ExceptionHandler;

/**
 * @author wcz0
 */

public enum ExceptionCodeEnum implements ExceptionHandler {
    // 数据操作错误定义
    SUCCESS(200, 0, "操作成功"),
    FAILED(400, 1, "操作失败"),
    PRAM_NOT_MATCH(422, 1, "参数不正确"),
    VALIDATE_FAILED(422, 1, "参数检验失败"),
    UNAUTHORIZED(401, 1, "未登录或token过期，请登录！"),
    FORBIDDEN(403, 1, "没有相关权限"),
    NOT_FOUND(404, 1, "没有找到相关数据"),
    ERROR(500, 1, "系统异常"),
    METHOD_NOT_ALLOWED(405, 1, "请求方法不正确"),
    ;

    private final Integer code;
    private final Integer status;
    private final String msg;

    private ExceptionCodeEnum(int code, int status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public Integer getStatus() {
        return status;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
