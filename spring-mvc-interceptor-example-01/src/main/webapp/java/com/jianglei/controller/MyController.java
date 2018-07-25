package com.jianglei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jianglei
 * @since 7/20/18
 */
@Controller
@RequestMapping("/my")
public class MyController {

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return "sayHello";
    }
}
