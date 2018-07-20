package com.jianglei.controller.advice;

import com.jianglei.controller.ExceptionController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jianglei
 * @since 7/20/18
 */
@ControllerAdvice(basePackageClasses = ExceptionController.class)
public class MyControllerAdvice {

    @ExceptionHandler
    @ResponseBody
    public String exceptionHandler(Exception ex) {
        return "MyControllerAdvice handler";
    }
}
