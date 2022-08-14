package com.k.spring.boot.data.jdbc.dao;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;

public interface SpringDao {
    @Caching
    @Cacheable
    void insert();
}
