package com.jianglei.handler.exception.resolver;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jianglei
 * @since 7/20/18
 */
@Component
public class MyExceptionHandlerResolver implements HandlerExceptionResolver, Ordered {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if (ex instanceof BindException) {
            ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
            modelAndView.addObject("status", "false");
            modelAndView.addObject("release", ex.getMessage());

            return modelAndView;
        }

        return null;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
