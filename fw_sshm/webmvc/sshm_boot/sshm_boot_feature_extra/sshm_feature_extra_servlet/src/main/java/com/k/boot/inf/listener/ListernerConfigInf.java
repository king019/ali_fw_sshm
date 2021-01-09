package com.k.boot.inf.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

@Slf4j
@Configuration
public class ListernerConfigInf {

    @Bean
    public ServletListenerRegistrationBean listerner1() {
        ServletListenerRegistrationBean listerner = new ServletListenerRegistrationBean();
        listerner.setListener(new ServletRequestListener() {
            @Override
            public void requestDestroyed(ServletRequestEvent sre) {
                log.info("listener1 requestDestroyed:{}", sre);
            }

            @Override
            public void requestInitialized(ServletRequestEvent sre) {
                log.info("listener1 requestInitialized:{}", sre);
            }
        });
        listerner.setOrder(1);
        return listerner;
    }

    @Bean
    public ServletListenerRegistrationBean listerner2() {
        ServletListenerRegistrationBean listerner = new ServletListenerRegistrationBean();
        listerner.setListener(new ServletRequestListener() {
            @Override
            public void requestDestroyed(ServletRequestEvent sre) {
                log.info("listener2 requestDestroyed:{}", sre);
            }

            @Override
            public void requestInitialized(ServletRequestEvent sre) {
                log.info("listener2 requestInitialized:{}", sre);
            }
        });
        listerner.setOrder(2);
        return listerner;
    }
}
