package com.wcz0.asb.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.Serial;

/**
 * @author wcz0
 */
@Slf4j
@RestControllerAdvice
public class BaseException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    private long code = ExceptionCodeEnum.FAILED.getCode();
    private String message = ExceptionCodeEnum.FAILED.getMessage();

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
