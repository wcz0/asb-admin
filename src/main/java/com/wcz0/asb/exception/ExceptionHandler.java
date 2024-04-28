package com.wcz0.asb.exception;

/**
 * Exception handler interface.
 * @author wcz0
 */
public interface ExceptionHandler {
    /**
     * 错误码
     * @return the code.
     */
    Integer getCode();
    /**
     * 状态
     *
     * @return the status.
     */
    Integer getStatus();
    /**
     * 错误信息
     * @return the message.
     */
    String getMsg();
}
