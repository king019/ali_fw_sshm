package com.k.spring.boot.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BootUtil {
    public void test() {
        log.info("test" + System.currentTimeMillis());
    }
}
