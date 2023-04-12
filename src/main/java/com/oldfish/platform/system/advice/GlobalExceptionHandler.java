package com.oldfish.platform.system.advice;

import com.oldfish.platform.system.entity.Result;
import com.oldfish.platform.system.exception.OldfishException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(OldfishException.class)
    public Result<Void> handleOldfishException(OldfishException e) {
        log.error(e.getMessage(), e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result<Void> handleGlobalException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(e.getMessage());
    }

}
