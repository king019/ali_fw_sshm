package com.k.sshm.feature.extra.servlet.inf.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@Slf4j
@WebListener
@Order(10)
public class Listener1 implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("requestDestroyed:{}", sre);
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("requestInitialized:{}", sre);
    }
}
