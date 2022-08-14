package com.k.spring.boot.control;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;

@Controller
@CacheConfig(cacheManager = "cacheManager", cacheResolver = "cacheResolver")
public class SpringControl {

    @Cacheable
    public Integer insert(Integer id) {
        return 1;
    }
}
