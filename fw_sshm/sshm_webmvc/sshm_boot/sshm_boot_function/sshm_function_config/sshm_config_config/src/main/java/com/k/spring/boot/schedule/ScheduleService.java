package com.k.spring.boot.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduleService {
    //@Scheduled(cron = "0/5 * * * * ? ")
    //@Scheduled(fixedRate = 5000)
    @Scheduled(fixedDelay = 5000)
    public void cron() {
        log.info("", this);
    }
}
