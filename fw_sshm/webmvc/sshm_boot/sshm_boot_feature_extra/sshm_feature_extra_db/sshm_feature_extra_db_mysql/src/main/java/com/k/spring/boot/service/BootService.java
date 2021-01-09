package com.k.spring.boot.service;

public interface BootService {
    public Object boot();

    Integer insert();

    //@Transactional(rollbackFor = Exception.class)
    Integer insertWhtiTrans();

    Object query();

    //@Transactional(rollbackFor = Exception.class)
    Object queryWithTrans();
}
