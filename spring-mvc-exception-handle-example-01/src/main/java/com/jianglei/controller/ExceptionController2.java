package com.jianglei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author jianglei
 * @since 7/20/18
 */
@Controller
@RequestMapping("/exception2")
public class ExceptionController2 {

    @ExceptionHandler
    @ResponseBody
    public String exceptionHandler(BindException ex) {
        return "捕猎了BindException";
    }


    @RequestMapping("/bind")
    @ResponseBody
    public String sayHello01() throws BindException {
        throw new BindException(new Object(), "obj");
    }
}
