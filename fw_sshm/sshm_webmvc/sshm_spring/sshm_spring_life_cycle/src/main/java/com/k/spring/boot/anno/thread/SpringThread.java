package com.k.spring.boot.anno.thread;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
@Slf4j
public class SpringThread {
    private String className = SpringThread.class.getName();
    private ExecutorService pool = Executors.newFixedThreadPool(1);

    @PostConstruct
    private void init() {
        pool = Executors.newFixedThreadPool(1);
        pool.submit(new TaskRun());
        log.info(className.concat("@PostConstruct"));
    }

    @PreDestroy
    private void destroy() {
        pool.shutdown();
        log.info(className.concat("@PreDestroy"));
    }

    static class TaskRun implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
