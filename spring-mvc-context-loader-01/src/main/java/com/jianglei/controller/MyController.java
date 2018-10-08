package com.jianglei.controller;

import com.jianglei.bean.MyBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jianglei
 * @since 7/27/18
 */
@RequestMapping("/my")
@Controller
public class MyController {


    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(MyBean myBean) {
        return "hello" + myBean;
    }
}
