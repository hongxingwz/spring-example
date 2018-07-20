package com.jianglei.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author jianglei
 * @since 7/20/18
 */
@Configuration
@ComponentScan(basePackages = {"com.jianglei"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = EnableWebMvc.class),
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)
})
public class RootConfig {
}
