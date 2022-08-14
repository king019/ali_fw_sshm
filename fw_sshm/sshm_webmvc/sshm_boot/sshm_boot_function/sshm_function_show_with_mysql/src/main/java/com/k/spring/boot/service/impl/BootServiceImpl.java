package com.k.spring.boot.service.impl;

import com.k.spring.boot.dao.BootDao;
import com.k.spring.boot.mybatis.dto.Tb;
import com.k.spring.boot.service.BootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootServiceImpl implements BootService {
    @Autowired
    private BootDao bootDao;

    @Override
    public void boot() {
        bootDao.boot();
    }

    @Override
    public List<Tb> select() {

        return bootDao.query();
    }
}
