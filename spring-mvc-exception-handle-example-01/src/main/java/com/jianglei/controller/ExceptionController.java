package com.jianglei.controller;

import com.jianglei.exception.self.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author jianglei
 * @since 7/20/18
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/bind")
    @ResponseBody
    public String sayHello01() throws BindException {
        throw new BindException(new Object(), "obj");
    }

    @RequestMapping("/sayHello02")
    @ResponseBody
    public String sayHello02() throws Exception {
        throw new Exception();
    }

    @RequestMapping("/sayHello03")
    @ResponseBody
    public String sayHello03() {
        throw new MyException();
    }


    @RequestMapping("/sayHello04")
    public ModelAndView sayHello04(HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE);
        return new ModelAndView();
    }
}
