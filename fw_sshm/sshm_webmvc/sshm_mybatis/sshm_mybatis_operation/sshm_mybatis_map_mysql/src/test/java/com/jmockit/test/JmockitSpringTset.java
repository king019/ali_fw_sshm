package com.jmockit.test;

import com.k.web.mybatis.dao.MybatisTestDao;
import com.k.web.mybatis.dao.base.dao.BaseDao;
import com.k.web.mybatis.dao.base.dao.impl.BaseDaoImpl;
import com.k.web.mybatis.dao.base.vo.ParamObj;
import com.k.web.mybatis.dao.impl.MybatisTestDaoImpl;
import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.service.impl.MybatisTestService1Impl;
import com.k.web.mybatis.util.DbOperation;
import mockit.*;
import mockit.integration.junit4.JMockit;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class JmockitSpringTset {
    @Tested
    private MybatisTestService1Impl mybatisTestService1 = new MybatisTestService1Impl();
    @Injectable
    private BaseDao baseDao = new BaseDaoImpl();
    @Injectable
    private MybatisTestDao mybatisTestDao = new MybatisTestDaoImpl();

    @Test
    @Ignore
    public void select() {
        new Expectations(baseDao) {
        };
        new MockUp<BaseDao>() {
            @Mock
            public int insertObj(ParamObj condition) {
                return 1;
            }
        };
        VO vo = new VO();
        try {
            mybatisTestService1.insertAll(vo, DbOperation.df1);
            // mybatisTestService2.insertAll(vo, DbOperation.df2);
            // mybatisTestService3.insertAll(vo, DbOperation.df3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
