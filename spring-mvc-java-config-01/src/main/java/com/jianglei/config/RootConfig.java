package com.jianglei.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * @author jianglei
 * @since 7/25/18
 */
@Configuration
@ComponentScan(basePackages = {"com.jianglei"}, excludeFilters = {@ComponentScan.Filter(classes = {Controller.class})})
public class RootConfig {
}
