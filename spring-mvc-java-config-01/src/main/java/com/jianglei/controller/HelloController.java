package com.jianglei.controller;

import com.jianglei.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jianglei
 * @since 7/25/18
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return helloService.sayHello();
    }
}
