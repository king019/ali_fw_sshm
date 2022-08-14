package com.k.atomikos.service;

import com.k.atomikos.entity.Test1;
import com.k.atomikos.entity.Test2;
import com.k.atomikos.repository.primary.Test1Dao;
import com.k.atomikos.repository.secondary.Test2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Test1Service {
    @Autowired
    private Test1Dao test1Dao;
    @Autowired
    private Test2Dao test2Dao;
    @Autowired
    private Test2Service test2Service;

    @Transactional
    public void save() {
        Test1 t1 = new Test1();
        t1.setName("t1");
        test1Dao.add(t1);
        //test1Dao.add(t1);
        Test2 t2 = new Test2();
        t2.setName("t2");
        //test2Dao.add(t2);
        test2Dao.getById(1L);
        //throw new RuntimeException();
    }
}
