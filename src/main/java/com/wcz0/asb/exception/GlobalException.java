package com.wcz0.asb.exception;

import com.wcz0.asb.enums.ExceptionCodeEnum;
import com.wcz0.asb.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;
import java.util.stream.Collectors;


/**
 * @author wcz0
 */
@RestControllerAdvice
@Slf4j
public class GlobalException {

    /**
     * 处理自定义异常
     */
    @ExceptionHandler(BaseException.class)
    public Result<?> baseExceptionHandler(BaseException e) {
        log.error("BaseException: " + e.getMessage(), e);
        return Result.failed(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result<?> exceptionHandler(Exception e) {
        log.error("Exception: " + e.getMessage(), e);
        return Result.failed(ExceptionCodeEnum.ERROR);
    }

    /**
     * 表单异常处理
     * TODO: 后续添加到data里返回
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<?> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        log.warn("MethodArgumentNotValidException: " + e.getMessage(), e);
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        String errorMessage = fieldErrors.stream()
                .map(fieldError -> fieldError.getField() + ": " + fieldError.getDefaultMessage())
                .collect(Collectors.joining(", "));
        return Result.failed(ExceptionCodeEnum.VALIDATE_FAILED, errorMessage, null);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Result<?> missingServletRequestParameterExceptionHandler(MissingServletRequestParameterException e) {
        log.warn("MissingServletRequestParameterException: " + e.getMessage(), e);
        return Result.failed(ExceptionCodeEnum.VALIDATE_FAILED, e.getMessage(), null);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public Result<?> methodArgumentTypeMismatchExceptionHandler(MethodArgumentTypeMismatchException e) {
        log.warn("MethodArgumentTypeMismatchException: " + e.getMessage(), e);
        return Result.failed(ExceptionCodeEnum.VALIDATE_FAILED, e.getMessage(), null);
    }

    @ExceptionHandler(BindException.class)
    public Result<?> bindExceptionHandler(BindException e) {
        log.warn("BindException: " + e.getMessage(), e);
        return Result.failed(ExceptionCodeEnum.VALIDATE_FAILED, e.getMessage(), null);
    }




//    /**
//     * 处理所有异常，主要是提供给 Filter 使用
//     * 因为 Filter 不走 SpringMVC 的流程，但是我们又需要兜底处理异常，所以这里提供一个全量的异常处理过程，保持逻辑统一。
//     *
//     * @param request 请求
//     * @param ex 异常
//     * @return 通用返回
//     */
//    public Result<?> allExceptionHandler(HttpServletRequest request, Throwable ex) {
//        if (ex instanceof MissingServletRequestParameterException) {
////            return missingServletRequestParameterExceptionHandler((MissingServletRequestParameterException) ex);
//        }
//        if (ex instanceof MethodArgumentTypeMismatchException) {
////            return methodArgumentTypeMismatchExceptionHandler((MethodArgumentTypeMismatchException) ex);
//        }
//        if (ex instanceof MethodArgumentNotValidException) {
////            return methodArgumentNotValidExceptionExceptionHandler((MethodArgumentNotValidException) ex);
//        }
//        if (ex instanceof BindException) {
//            return bindExceptionHandler((BindException) ex);
//        }
//        if (ex instanceof ConstraintViolationException) {
//            return constraintViolationExceptionHandler((ConstraintViolationException) ex);
//        }
//        if (ex instanceof ValidationException) {
//            return validationException((ValidationException) ex);
//        }
//        if (ex instanceof NoHandlerFoundException) {
//            return noHandlerFoundExceptionHandler(request, (NoHandlerFoundException) ex);
//        }
//        if (ex instanceof HttpRequestMethodNotSupportedException) {
//            return httpRequestMethodNotSupportedExceptionHandler((HttpRequestMethodNotSupportedException) ex);
//        }
//        if (ex instanceof ServiceException) {
//            return serviceExceptionHandler((ServiceException) ex);
//        }
//        if (ex instanceof AccessDeniedException) {
//            return accessDeniedExceptionHandler(request, (AccessDeniedException) ex);
//        }
//        return defaultException(request, ex);
//    }
}