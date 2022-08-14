package com.k.web.mybatis.service;

import com.k.web.mybatis.model.VO;

import java.util.List;

public interface MybatisTestService {
    public List<VO> select(VO vo) throws Exception;

    public void insert(VO vo) throws Exception;

    public void update(VO vo) throws Exception;

    public void delete(VO vo) throws Exception;

    public void insertAll(VO vo) throws Exception;
}
