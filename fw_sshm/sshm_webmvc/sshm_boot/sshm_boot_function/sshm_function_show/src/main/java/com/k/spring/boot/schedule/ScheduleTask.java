package com.k.spring.boot.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduleTask {
    //@Scheduled(cron = "* * * * * ?")
    public void schedule() {
        // ScheduledExecutorService pool;
        // pool.scheduleAtFixedRate(command, initialDelay, period, unit)
        // pool.scheduleWithFixedDelay(command, initialDelay, delay, unit);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("", System.currentTimeMillis());
    }
}
