package com.k.spring.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TaskAsync {
    @Async
    public void async() {
        try {
            Thread.sleep(5000);
            log.info("sync");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
