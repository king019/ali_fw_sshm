package com.k.boot.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@Slf4j
public class ModelProperty implements InitializingBean, DisposableBean {
    private long time = System.currentTimeMillis();

    @Override
    public void afterPropertiesSet() throws Exception {
        log.error("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        log.error("destroy");
    }
}
