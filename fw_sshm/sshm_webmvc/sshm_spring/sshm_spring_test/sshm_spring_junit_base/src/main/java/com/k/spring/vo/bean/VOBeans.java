package com.k.spring.vo.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class VOBeans {
    // @Value("file_root")
    public String name;

    public void init() {
        log.info("init");
    }

    public void destroy() {
        log.info("destroy");
    }
}
