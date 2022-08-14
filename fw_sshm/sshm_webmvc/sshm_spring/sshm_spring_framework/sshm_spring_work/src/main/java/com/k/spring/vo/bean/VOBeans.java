package com.k.spring.vo.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class VOBeans {
    // @Value("file_root")
    public String name;

    private void init() {
        log.info("init");
    }
}
