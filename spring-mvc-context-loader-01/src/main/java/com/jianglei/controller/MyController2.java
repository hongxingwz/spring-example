package com.jianglei.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jianglei
 * @since 7/27/18
 */
public class MyController2 implements Controller, LastModified {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setStatus(200);
        response.getWriter().write("aaaaa");
        return new ModelAndView();
    }

    @Override
    public long getLastModified(HttpServletRequest request) {
        return  System.currentTimeMillis();
    }
}
