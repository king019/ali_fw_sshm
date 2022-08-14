package com.k.web.mybatis.service3.impl;

import com.k.web.mybatis.dao.MybatisTestDao;
import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.service3.MybatisTestService3;
import com.k.web.mybatis.util.DbOperation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MybatisTestService3Impl implements MybatisTestService3 {
    @Resource
    private MybatisTestDao mybatisTestDao;

    @Override
    public List<VO> select(VO vo, DbOperation db) throws Exception {
        return mybatisTestDao.select(vo, db);
    }

    @Override
    public void insert(VO vo, DbOperation db) throws Exception {
        mybatisTestDao.insert(vo, db);
    }

    @Override
    public void update(VO vo, DbOperation db) throws Exception {
        mybatisTestDao.update(vo, db);
    }

    @Override
    public void delete(VO vo, DbOperation db) throws Exception {
        mybatisTestDao.delete(vo, db);
    }

    @Override
    public void insertAll(VO vo, DbOperation db) throws Exception {
        mybatisTestDao.insert(vo, db);
        int i = 0;
        if (i == 0) {
            // throw new RuntimeException();
        }
        // mybatisTestDao.update(vo);
    }
}
