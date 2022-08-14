package com.k.web.mybatis.dao;

import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.util.DbOperation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MybatisTestDao {
    List<VO> select(VO vo, DbOperation db) throws Exception;

    List<VO> selectMap(VO vo, DbOperation db) throws Exception;

    @Transactional(propagation = Propagation.NESTED)
    void insert(VO vo, DbOperation db) throws Exception;

    // @Transactional(propagation = Propagation.NESTED)
    void insert2(VO vo, DbOperation db) throws Exception;

    void update(VO vo, DbOperation db) throws Exception;

    void delete(VO vo, DbOperation db) throws Exception;
}
