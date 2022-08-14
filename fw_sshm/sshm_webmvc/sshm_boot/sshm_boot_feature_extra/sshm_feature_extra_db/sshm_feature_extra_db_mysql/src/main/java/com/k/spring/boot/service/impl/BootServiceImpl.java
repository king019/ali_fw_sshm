package com.k.spring.boot.service.impl;

import com.k.spring.boot.dao.BootDao;
import com.k.spring.boot.service.BootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BootServiceImpl implements BootService {
    @Autowired
    private BootDao bootDao;

    @Override
    public Object boot() {
        return bootDao.boot();
    }

    @Override
    public Integer insert() {
        return bootDao.insert();
    }

    @Override
    public Integer insertWhtiTrans() {
        return insert();
    }

    @Override
    @Transactional
    public Object query() {
        return bootDao.query();
    }

    @Override
    public Object queryWithTrans() {
        return query();
    }
}
