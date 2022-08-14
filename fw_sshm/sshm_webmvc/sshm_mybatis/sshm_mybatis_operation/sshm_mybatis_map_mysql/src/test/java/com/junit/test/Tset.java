package com.junit.test;

import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.service.MybatisTestService1;
import com.k.web.mybatis.service2.MybatisTestService2;
import com.k.web.mybatis.service3.MybatisTestService3;
import com.k.web.mybatis.util.DbOperation;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
// @TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
// @Transactional(timeout = 1)
public class Tset {

    @Resource
    public MybatisTestService1 mybatisTestService1;
    @Resource
    public MybatisTestService2 mybatisTestService2;
    @Resource
    public MybatisTestService3 mybatisTestService3;

    @Test
    @Ignore
    public void test() {
        VO vo = new VO();
        try {
            mybatisTestService1.insertAll(vo, DbOperation.df1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //mybatisTestService2.insertAll(vo, DbOperation.df2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //mybatisTestService3.insertAll(vo, DbOperation.df3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
