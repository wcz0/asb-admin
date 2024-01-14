package com.wcz0.asb.exception;

import com.wcz0.asb.response.Result;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

/**
 * @author wcz0
 */
@RestControllerAdvice
public class GlobalException {
    /**
     * 拦截表单参数校验
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler({BindException.class})
    public Result bindException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        return Result.failed(ExceptionCodeEnum.VALIDATE_FAILED, Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
    }

    /**
     * 拦截JSON参数校验
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result bindException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        return Result.failed(ExceptionCodeEnum.VALIDATE_FAILED,Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
    }

    /**
     * 拦截参数类型不正确
     * @param e
     * @return
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public Result bindException(HttpMediaTypeNotSupportedException e){
        return Result.failed(ExceptionCodeEnum.PRAM_NOT_MATCH,Objects.requireNonNull(e.getMessage()));
    }


    //声明要捕获的异常
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public <T> Result<?> defaultExceptionHandler(Exception e) {
        e.printStackTrace();
        if(e instanceof BaseException) {
            return Result.failed(ExceptionCodeEnum.FAILED,Objects.requireNonNull(e.getMessage()));
        }
        if(e instanceof MissingServletRequestParameterException){
            return Result.failed(ExceptionCodeEnum.PRAM_NOT_MATCH, Objects.requireNonNull(e.getMessage()));
        }
        //未知错误
        return Result.failed(ExceptionCodeEnum.ERROR,e.getMessage());
    }
}
