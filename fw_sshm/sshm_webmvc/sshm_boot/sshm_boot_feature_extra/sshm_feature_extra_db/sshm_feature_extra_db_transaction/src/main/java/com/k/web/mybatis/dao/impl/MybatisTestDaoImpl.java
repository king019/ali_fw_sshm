package com.k.web.mybatis.dao.impl;

import com.k.web.mybatis.dao.MybatisTestDao;
import com.k.web.mybatis.mybatis.mapper.MybatisTable1Mapper;
import com.k.web.mybatis.mybatis.model.MybatisTable1;
import com.k.web.mybatis.mybatis.model.MybatisTable1Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MybatisTestDaoImpl implements MybatisTestDao {
    @Autowired
    private MybatisTable1Mapper mybatisTable1Mapper;

    @Override
    public List<MybatisTable1> select() throws Exception {
        MybatisTable1Example example = new MybatisTable1Example();
        example.createCriteria().andId1EqualTo(1);
        return mybatisTable1Mapper.selectByExample(example);
    }

    @Override
    public void insert(MybatisTable1 vo) throws Exception {
        mybatisTable1Mapper.insert(vo);
        if (vo.getMybatisId1() == 1) {
            throw new RuntimeException();
        }
    }

    @Override
    public void update(MybatisTable1 vo) throws Exception {
        mybatisTable1Mapper.updateByExampleSelective(vo, new MybatisTable1Example());
    }

    @Override
    public void delete(MybatisTable1 vo) throws Exception {
        mybatisTable1Mapper.deleteByExample(new MybatisTable1Example());
    }
}
