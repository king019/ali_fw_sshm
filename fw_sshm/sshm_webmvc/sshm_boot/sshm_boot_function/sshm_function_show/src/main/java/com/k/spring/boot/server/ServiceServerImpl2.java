package com.k.spring.boot.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class ServiceServerImpl2 implements ServiceServer2 {

    @PostConstruct
    private void init() {
        log.info("init");
    }
}
