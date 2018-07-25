package com.jianglei.config;

import com.jianglei.controller.MyController;
import com.jianglei.interceptor.MyHandlerInterceptor01;
import com.jianglei.interceptor.MyHandlerInterceptor02;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author jianglei
 * @since 7/20/18
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = MyController.class)
public class WebApp extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor02()).addPathPatterns("/**");
        registry.addInterceptor(new MyHandlerInterceptor01()).addPathPatterns("/**");

    }
}
