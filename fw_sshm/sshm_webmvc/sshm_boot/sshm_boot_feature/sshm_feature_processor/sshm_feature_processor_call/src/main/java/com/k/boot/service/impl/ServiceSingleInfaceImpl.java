package com.k.boot.service.impl;

import com.k.boot.service.EchoServiceInface;
import com.k.boot.service.ServiceSingleInface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ServiceSingleInfaceImpl implements ServiceSingleInface, EchoServiceInface {

    @Override
    public void test() {
        log.info("test");
    }

    @Override
    public void echo() {
        log.info("echo");
    }
}
