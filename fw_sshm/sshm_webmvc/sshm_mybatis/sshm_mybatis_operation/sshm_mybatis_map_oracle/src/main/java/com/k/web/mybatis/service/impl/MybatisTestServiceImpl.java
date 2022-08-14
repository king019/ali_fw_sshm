package com.k.web.mybatis.service.impl;

import com.k.web.mybatis.dao.MybatisTestDao;
import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.service.MybatisTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MybatisTestServiceImpl implements MybatisTestService {
    @Resource
    private MybatisTestDao mybatisTestDao;

    @Override
    public List<VO> select(VO vo) throws Exception {
        return mybatisTestDao.select(vo);
    }

    @Override
    public void insert(VO vo) throws Exception {
        mybatisTestDao.insert(vo);
    }

    @Override
    public void update(VO vo) throws Exception {
        mybatisTestDao.update(vo);
    }

    @Override
    public void delete(VO vo) throws Exception {
        mybatisTestDao.delete(vo);
    }

    @Override
    public void insertAll(VO vo) throws Exception {
        mybatisTestDao.insert(vo);
        mybatisTestDao.update(vo);
    }
}
