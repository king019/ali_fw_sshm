package com.k.spring.boot.dao;


import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
public interface BootDao {
    Object boot();

    int insert();

    int delete();

    //@Transactional(rollbackFor = NullPointerException.class)
    Object query();
}
