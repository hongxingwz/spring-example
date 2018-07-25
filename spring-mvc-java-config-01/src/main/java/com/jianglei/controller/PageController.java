package com.jianglei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jianglei
 * @since 7/25/18
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        return page;
    }
}
