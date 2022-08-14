package com.k.spring.boot.data.jdbc.dao.impl;

import com.k.spring.boot.data.jdbc.dao.SpringDao;
import com.k.spring.boot.mybatis.dao.TbMapper;
import com.k.spring.boot.mybatis.dto.Tb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Repository
public class SpringDaoImpl implements SpringDao {
    @Autowired
    private TbMapper tbMapper;

    @Override
    @Transactional
    public void insert() {
        Tb tb = new Tb();
        tb.setTbname(UUID.randomUUID().toString());
        tbMapper.insert(tb);
    }
}
