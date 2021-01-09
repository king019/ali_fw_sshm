package com.k.web.mybatis.service;
import com.k.web.mybatis.mybatis.model.MybatisTable1;

import java.util.List;
public interface MybatisTestService {
    List<MybatisTable1> select() throws Exception;
    //@Transactional(propagation = Propagation.REQUIRED)
    void insert(MybatisTable1 vo) throws Exception;
    // @Transactional(propagation = Propagation.NESTED)
    void update(MybatisTable1 vo) throws Exception;
    void delete(MybatisTable1 vo) throws Exception;
}
