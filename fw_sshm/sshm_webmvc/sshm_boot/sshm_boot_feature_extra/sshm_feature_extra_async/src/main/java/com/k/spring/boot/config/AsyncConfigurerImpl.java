package com.k.spring.boot.config;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.stereotype.Service;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Service
public class AsyncConfigurerImpl implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        return new ThreadPoolExecutor(
                1,
                1,
                10,
                TimeUnit.DAYS,
                new ArrayBlockingQueue<>(10),
                new ThreadFactoryBuilder().build(),
                (r, executor) -> {
                });
    }
}
