package com.k.web.mybatis.service.impl;

import com.k.web.mybatis.dao.MybatisTestDao;
import com.k.web.mybatis.mybatis.model.MybatisTable1;
import com.k.web.mybatis.service.MybatisTestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = RuntimeException.class)
public class MybatisTestServiceImpl implements MybatisTestService {
    @Resource
    private MybatisTestDao mybatisTestDao;

    @Override
    public List<MybatisTable1> select() throws Exception {
        return mybatisTestDao.select();
    }

    @Override
    public void insert(MybatisTable1 vo) throws Exception {
        mybatisTestDao.insert(vo);
    }

    @Override
    public void update(MybatisTable1 vo) throws Exception {
        mybatisTestDao.update(vo);
    }

    @Override
    public void delete(MybatisTable1 vo) throws Exception {
        mybatisTestDao.delete(vo);
    }
}
