package com.k.spring.boot.schedule.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * @see ScheduledAnnotationBeanPostProcessor
 */
@Slf4j
@Service
public class ScheduleService {

    //@Scheduled(cron = "0/5 * * * * ? ")
    //@Scheduled(fixedRate = 5000)
    @Scheduled(fixedDelay = 5000)
    public void cron() {
        log.info("", this);
    }
}
