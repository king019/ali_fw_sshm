package com.k.web.mybatis.service.impl;

import com.k.web.mybatis.dao.MybatisTestDao;
import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.service.MybatisTestService1;
import com.k.web.mybatis.util.DbOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
@Transactional(propagation = Propagation.REQUIRED, value = "tx")
public class MybatisTestService1Impl implements MybatisTestService1 {
    @Resource
    private MybatisTestDao mybatisTestDao;

    @Override
    public List<VO> select(VO vo, DbOperation db) throws Exception {
        log.info(MybatisTestService1Impl.class.getName());
        return mybatisTestDao.select(vo, db);
    }

    @Override
    public List<VO> selectMap(VO vo, DbOperation db) throws Exception {
        return mybatisTestDao.selectMap(vo, db);
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
        // mybatisTestDao.insert(vo, db);
        // mybatisTestDao.insert(vo, DbOperation.df1);
        mybatisTestDao.insert(vo, db);
        // mybatisTestDao.insert(vo, DbOperation.df3);
        // mybatisTestDao.update(vo);
    }

    public MybatisTestDao getMybatisTestDao() {
        return mybatisTestDao;
    }

    public void setMybatisTestDao(MybatisTestDao mybatisTestDao) {
        this.mybatisTestDao = mybatisTestDao;
    }
}
