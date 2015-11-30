package com.hx78.webapps;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by linming on 2015/8/18 0018.
 */
//@WebFilter(filterName = "SecondFilter")
public class SecondFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
        System.out.println("======SecondFilter init========");
        String param1 = config.getInitParameter("param1");
        String param2 = config.getInitParameter("param2");
        System.out.println("SecondFilter param1:" + param1);
        System.out.println("SecondFilter param2:" + param2);
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("======SecondFilter doFilter 1========");
        String param1 = req.getParameter("param1");
        String param2 = req.getParameter("param2");
        System.out.println("SecondFilter param1:" + param1);
        System.out.println("SecondFilter param2:" + param2);
        chain.doFilter(req, resp);
        System.out.println("======SecondFilter doFilter 2========");

    }

    public void destroy() {
        System.out.println("======FirstFilter destroy========");
    }

}
