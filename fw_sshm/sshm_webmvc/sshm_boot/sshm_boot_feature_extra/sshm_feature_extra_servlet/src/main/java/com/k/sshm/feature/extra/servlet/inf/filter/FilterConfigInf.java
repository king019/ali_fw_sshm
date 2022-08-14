package com.k.sshm.feature.extra.servlet.inf.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
@Configuration
public class FilterConfigInf {

    @Bean
    public FilterRegistrationBean filter1() {
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setName("configfilter1");
        filter.setFilter(new Filter() {
            @Override
            public void init(FilterConfig filterConfig) throws ServletException {
                log.info("configFilter1_init");
            }

            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                log.info("configFilter1_doFilter start");
                chain.doFilter(request, response);
                log.info("configFilter1_doFilter end");
            }

            @Override
            public void destroy() {
                log.info("configFilter1_destroy");
            }
        });
        filter.setOrder(11);
        //filter.setMatchAfter(true);
        return filter;
    }

    @Bean
    public FilterRegistrationBean filter2() {
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setName("configfilter2");
        filter.setFilter(new Filter() {
            @Override
            public void init(FilterConfig filterConfig) throws ServletException {
                log.info("configFilter2_init");
            }
            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                log.info("configFilter2_doFilter start");
                chain.doFilter(request, response);
                log.info("configFilter2_doFilter end");
            }

            @Override
            public void destroy() {
                log.info("configFilter2_destroy");
            }
        });
        filter.setOrder(22);
        return filter;
    }
}
