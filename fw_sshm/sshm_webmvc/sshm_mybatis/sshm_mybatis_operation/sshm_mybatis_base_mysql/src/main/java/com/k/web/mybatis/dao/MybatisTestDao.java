package com.k.web.mybatis.dao;

import com.k.web.mybatis.model.VO;

import java.util.List;

public interface MybatisTestDao {

    List<VO> select(VO vo) throws Exception;

    void insert(VO vo) throws Exception;

    void update(VO vo) throws Exception;

    void delete(VO vo) throws Exception;
}
