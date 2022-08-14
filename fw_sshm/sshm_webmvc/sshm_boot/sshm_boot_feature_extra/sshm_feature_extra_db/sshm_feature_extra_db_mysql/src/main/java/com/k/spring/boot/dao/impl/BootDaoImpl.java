package com.k.spring.boot.dao.impl;

import com.k.spring.boot.dao.BootDao;
import com.k.spring.boot.mybatis.dao.Blog1Mapper;
import com.k.spring.boot.mybatis.dto.Blog1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 实现类方法->接口方法->实现类->接口类
 */
@Transactional(rollbackFor = NumberFormatException.class)
@Service
public class BootDaoImpl implements BootDao {

    @Autowired
    private Blog1Mapper blog1Mapper;

    @Override
    public Object boot() {
        return query();
    }

    @Override
    public int insert() {
        Blog1 blog1 = new Blog1();
        blog1.setBlogName("name");
        blog1.setSumNum(1);
        blog1.setBlogTime(new Date());
        blog1Mapper.insert(blog1);
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    //@Transactional(propagation= Propagation.NESTED)
    public Object query() {
        //throw new RuntimeException();
        return blog1Mapper.selectByPrimaryKey(1);
    }
}
