package com.k.web.mybatis.dao;

import com.k.web.mybatis.model.VO;

import java.util.List;

public interface MybatisTestDao {
    public List<VO> select(VO vo) throws Exception;

    public void insert(VO vo) throws Exception;

    public void update(VO vo) throws Exception;

    public void delete(VO vo) throws Exception;
}
