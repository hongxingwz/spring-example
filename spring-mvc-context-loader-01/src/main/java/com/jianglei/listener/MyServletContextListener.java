package com.jianglei.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author jianglei
 * @since 7/27/18
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        ServletContext servletContext = sce.getServletContext();
//        servletContext.setAttribute("org.springframework.web.context.WebApplicationContext.ROOT", "aaaa");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
