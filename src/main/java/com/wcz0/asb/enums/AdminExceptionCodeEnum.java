package com.wcz0.asb.enums;

import com.wcz0.asb.exception.ExceptionHandler;

/**
 * @author wcz0
 */

public enum AdminExceptionCodeEnum implements ExceptionHandler {
    // 数据操作错误定义
    SUCCESS(0, "操作成功"),
    FAILED(400, "操作失败"),
    PRAM_NOT_MATCH(422, "参数不正确"),
    VALIDATE_FAILED(422, "参数检验失败"),
    UNAUTHORIZED(401, "未登录或token过期，请登录！"),
    FORBIDDEN(403, "没有相关权限"),
    NOT_FOUND(404, "没有找到相关数据"),
    ERROR(500, "系统异常"),
    METHOD_NOT_ALLOWED(405, "请求方法不正确"),
    ;

    private final long status;
    private final String msg;

    private final boolean doNotDisplayToast;

    private AdminExceptionCodeEnum(int status, String msg){
        this.status = status;
        this.msg = msg;
        this.doNotDisplayToast = false;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}

