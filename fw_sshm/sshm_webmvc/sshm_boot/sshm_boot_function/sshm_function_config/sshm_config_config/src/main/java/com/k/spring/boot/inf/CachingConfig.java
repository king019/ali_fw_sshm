package com.k.spring.boot.inf;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.interceptor.*;
import org.springframework.cache.support.SimpleCacheManager;

//@Component
public class CachingConfig implements CachingConfigurer {
    @Override
    public CacheManager cacheManager() {
        return new SimpleCacheManager();
    }

    @Override
    public CacheResolver cacheResolver() {
        return new SimpleCacheResolver();
    }

    @Override
    public KeyGenerator keyGenerator() {
        return new SimpleKeyGenerator();
    }

    @Override
    public CacheErrorHandler errorHandler() {
        return new SimpleCacheErrorHandler();
    }
}
