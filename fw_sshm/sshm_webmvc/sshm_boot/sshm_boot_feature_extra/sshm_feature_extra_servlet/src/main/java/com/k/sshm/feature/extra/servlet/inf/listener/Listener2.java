package com.k.sshm.feature.extra.servlet.inf.listener;

import com.k.sshm.feature.extra.servlet.service.ServiceInface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@Slf4j
@WebListener
@Order(2)
public class Listener2 implements ServletRequestListener {
    @Autowired
    private ServiceInface serviceInface;

    @PostConstruct
    private void ini() {
        log.info("ini");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("requestDestroyed:{}", sre);
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("requestInitialized:{}", sre);
    }
}
