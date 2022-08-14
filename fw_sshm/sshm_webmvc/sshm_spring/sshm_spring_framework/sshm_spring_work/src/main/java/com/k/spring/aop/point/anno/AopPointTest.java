package com.k.spring.aop.point.anno;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AopPointTest {
    public void aoptest() {
        log.info("aoptest");
    }
}
