package com.jianglei.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author jianglei
 * @since 7/23/18
 */
@WebFilter(urlPatterns = "/**")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("do filter work");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
