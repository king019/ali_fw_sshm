package com.k.sshm.feature.extra.servlet.inf.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

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

    @Bean
    public ServletListenerRegistrationBean context() {
        ServletListenerRegistrationBean listerner = new ServletListenerRegistrationBean();
        listerner.setListener(new ServletContextListener() {
            @Override
            public void contextInitialized(ServletContextEvent sce) {
                log.info("context requestInitialized:{}", sce);
            }

            @Override
            public void contextDestroyed(ServletContextEvent sce) {
                log.info("context requestInitialized:{}", sce);
            }
        });
        listerner.setOrder(2);
        return listerner;
    }

    @Bean
    public ServletListenerRegistrationBean contextAttribute() {
        ServletListenerRegistrationBean listerner = new ServletListenerRegistrationBean();
        listerner.setListener(new ServletContextAttributeListener() {
            @Override
            public void attributeAdded(ServletContextAttributeEvent scae) {
                log.info("contextAttribute attributeAdded:{}", scae);
            }

            @Override
            public void attributeRemoved(ServletContextAttributeEvent scae) {
                log.info("contextAttribute attributeRemoved:{}", scae);
            }

            @Override
            public void attributeReplaced(ServletContextAttributeEvent scae) {
                log.info("contextAttribute attributeReplaced:{}", scae);
            }
        });
        listerner.setOrder(2);
        return listerner;
    }

    @Bean
    public ServletListenerRegistrationBean session() {
        ServletListenerRegistrationBean listerner = new ServletListenerRegistrationBean();
        listerner.setListener(new HttpSessionListener() {
            @Override
            public void sessionCreated(HttpSessionEvent se) {
                log.info("session sessionCreated:{}", se);
            }

            @Override
            public void sessionDestroyed(HttpSessionEvent se) {
                log.info("session sessionDestroyed:{}", se);
            }
        });
        listerner.setOrder(2);
        return listerner;
    }

//    @Bean
//    public ServletListenerRegistrationBean sessionid() {
//        ServletListenerRegistrationBean listerner = new ServletListenerRegistrationBean();
//        listerner.setListener(new HttpSessionIdListener() {
//
//            @Override
//            public void sessionIdChanged(HttpSessionEvent se, String oldSessionId) {
//                log.info("session sessionIdChanged:{}", se);
//            }
//        });
//        listerner.setOrder(2);
//        return listerner;
//    }
}
