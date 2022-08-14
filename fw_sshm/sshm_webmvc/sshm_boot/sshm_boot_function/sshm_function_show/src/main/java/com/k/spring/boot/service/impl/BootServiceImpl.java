package com.k.spring.boot.service.impl;

import com.k.spring.boot.dao.BootDao;
import com.k.spring.boot.service.BootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BootServiceImpl implements BootService {
    @Autowired
    private BootDao bootDao;

    @Override
    public void boot() {
        bootDao.boot();
    }
}
