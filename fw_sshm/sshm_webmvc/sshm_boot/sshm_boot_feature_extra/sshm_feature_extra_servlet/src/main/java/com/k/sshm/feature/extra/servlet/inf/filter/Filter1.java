package com.k.sshm.feature.extra.servlet.inf.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * https://blog.csdn.net/ieen_csdn/article/details/86612492?from=timeline&isappinstalled=0
 * AnnotationAwareOrderComparator 比较时 @Order注解不起作用
 */
@Slf4j
@WebFilter(urlPatterns = "/*")
@Order(1)//order无效
public class Filter1 implements Filter , Ordered //order无效
{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("webFilter1_init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("webFilter1_doFilter start");
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("webFilter1_doFilter end");
    }

    @Override
    public void destroy() {
        log.info("webFilter1_destroy");
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
