package com.k.spring.boot.data.jdbc.dao.impl;

import com.k.spring.boot.data.jdbc.dao.SpringDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SpringDaoImpl implements SpringDao {
    @Override
    @Transactional
    public void insert() {
    }
}
