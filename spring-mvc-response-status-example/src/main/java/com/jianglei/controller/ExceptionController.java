package com.jianglei.controller;

import com.jianglei.exception.MyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author jianglei
 * @since 7/20/18
 */
@RequestMapping("/exception")
@Controller
public class ExceptionController {

    @RequestMapping("/myException")
    @ResponseBody
    public String myException() throws MyException {
        throw new MyException();
    }


    @RequestMapping("/myException02")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "bad gateway")
    public String myException02() {
        return "myException02";
    }

    @RequestMapping("/myException03")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "bad gateway")
    public String myException03() throws Exception {
        throw new Exception("myException03");
    }

    @RequestMapping("/myException04")
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "bad gateway")
    public ResponseEntity<String> myException04() throws Exception {
        ResponseEntity<String> entity = new ResponseEntity<>("hello", HttpStatus.BAD_GATEWAY);
        return entity;
    }

    @RequestMapping("/myException05")
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "bad gateway")
    public String myException05() {
        return "redirect:/exception/myException";
    }

    @ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "bad gateway")
    @RequestMapping("/myException06")
    public void myException06(HttpServletResponse response) throws IOException {
        response.sendError(500, "error 500");
    }
}
