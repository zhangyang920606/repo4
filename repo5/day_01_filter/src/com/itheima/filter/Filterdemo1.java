package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class Filterdemo1 implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterdemo1执行了...");
        chain.doFilter(req, resp);
        System.out.println("filterdemo1返回后执行");
    }

    public void destroy() {
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
