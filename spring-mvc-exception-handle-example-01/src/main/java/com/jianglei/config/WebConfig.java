package com.jianglei.config;

import com.jianglei.controller.ExceptionController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author jianglei
 * @since 7/20/18
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = ExceptionController.class)
public class WebConfig extends WebMvcConfigurerAdapter {
}
