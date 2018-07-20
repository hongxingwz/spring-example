package com.jianglei.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author jianglei
 * @since 7/20/18
 */
@RequestMapping("/exception2")
@Controller
@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "forbidden")
public class ExceptionController2 {

    @ResponseBody
    @RequestMapping("/my01")
    public String my01() {
        return "my01";
    }

    @ResponseBody
    @RequestMapping("/my02")
    public String my02() {
        return "my02";
    }
}
