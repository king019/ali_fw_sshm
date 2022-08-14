package com.k.spring.boot.inf.pool;

import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Service
public class AsyncConfigurerImpl implements AsyncConfigurer {
    @Nullable
    @Override
    public Executor getAsyncExecutor() {
        return Executors.newSingleThreadExecutor();
    }
}
