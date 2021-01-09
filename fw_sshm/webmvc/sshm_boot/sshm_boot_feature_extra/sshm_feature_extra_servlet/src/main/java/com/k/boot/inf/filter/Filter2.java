package com.k.boot.inf.filter;

import com.k.boot.service.ServiceInface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
@Slf4j
@Order(2)
public class Filter2 implements Filter {
    @Autowired
    private ServiceInface serviceInface;

    @PostConstruct
    private void ini() {
        log.info("webFilter2_init_method_post");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("webFilter2_init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("webFilter2_doFilter start"); filterChain.doFilter(servletRequest, servletResponse);
        log.info("webFilter2_doFilter end");
    }

    @Override
    public void destroy() {
        log.info("webFilter2_destroy");
    }
}
