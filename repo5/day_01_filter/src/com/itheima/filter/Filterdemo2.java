package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class Filterdemo2 implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("filterdemo2执行了...");
        chain.doFilter(req, resp);
        System.out.println("filterdemo2返回后执行");

    }

    public void destroy() {
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
