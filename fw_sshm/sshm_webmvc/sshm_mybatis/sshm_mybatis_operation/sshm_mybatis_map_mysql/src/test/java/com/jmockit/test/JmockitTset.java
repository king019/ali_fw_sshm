package com.jmockit.test;

import com.k.web.mybatis.dao.base.dao.BaseDao;
import com.k.web.mybatis.dao.base.vo.ParamObj;
import com.k.web.mybatis.dao.impl.MybatisTestDaoImpl;
import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.service.impl.MybatisTestService1Impl;
import com.k.web.mybatis.service2.MybatisTestService2;
import com.k.web.mybatis.service3.MybatisTestService3;
import com.k.web.mybatis.util.DbOperation;
import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class JmockitTset {

    // @Mocked
    private MybatisTestService1Impl mybatisTestService1;
    @Mocked
    private MybatisTestService2 mybatisTestService2;
    @Mocked
    private MybatisTestService3 mybatisTestService3;

    @Test
    @Ignore
    public void select() {
        new Expectations() {
        };
        new MockUp<MybatisTestService1Impl>() {
        };
        new MockUp<MybatisTestDaoImpl>() {
            @Mock
            public void insert(VO vo, DbOperation db) throws Exception {
            }
        };
        new MockUp<BaseDao>() {
            @Mock
            public int insertObj(ParamObj condition) {
                return 1;
            }
        };
        VO vo = new VO();
        try {
            MybatisTestService1Impl mybatisTestService1 = new MybatisTestService1Impl();
            mybatisTestService1.insertAll(vo, DbOperation.df1);
            // mybatisTestService2.insertAll(vo, DbOperation.df2);
            // mybatisTestService3.insertAll(vo, DbOperation.df3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
