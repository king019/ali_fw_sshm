package com.k.atomikos.service;

import com.k.atomikos.entity.Test2;
import com.k.atomikos.repository.secondary.Test2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Test2Service {
    @Autowired
    private Test2Dao test2Dao;

    public void add(Test2 t) {
        test2Dao.add(t);
    }
}
