package com.k.web.mybatis.service3;

import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.util.DbOperation;

import java.util.List;

public interface MybatisTestService3 {
    List<VO> select(VO vo, DbOperation db) throws Exception;

    void insert(VO vo, DbOperation db) throws Exception;

    void update(VO vo, DbOperation db) throws Exception;

    void delete(VO vo, DbOperation db) throws Exception;

    void insertAll(VO vo, DbOperation db) throws Exception;
}
