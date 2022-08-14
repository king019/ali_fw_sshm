package com.k.sshm.feature.extra.servlet.inf.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
@Order(3)
@Slf4j
public class Filter3 implements Filter , Ordered {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("webFilter3_init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("webFilter3_doFilter start");
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("webFilter3_doFilter end");
    }

    @Override
    public void destroy() {
        log.info("webFilter3_destroy");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
