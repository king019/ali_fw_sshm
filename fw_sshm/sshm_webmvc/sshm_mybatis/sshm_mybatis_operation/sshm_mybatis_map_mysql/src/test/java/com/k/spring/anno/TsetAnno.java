package com.k.spring.anno;

import com.k.web.mybatis.dao.MybatisTestDao;
import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.service.MybatisTestService1;
import com.k.web.mybatis.service2.MybatisTestService2;
import com.k.web.mybatis.service3.MybatisTestService3;
import com.k.web.mybatis.util.DbOperation;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/common/*.xml", "classpath:spring/anno/*.xml"})
// @TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
// @Transactional(timeout = 1)
public class TsetAnno {

    @Autowired
    public MybatisTestService1 mybatisTestService1;
    @Autowired
    public MybatisTestService2 mybatisTestService2;
    @Autowired
    public MybatisTestService3 mybatisTestService3;
    @Autowired
    private MybatisTestDao mybatisTestDao;

    @Test
    @Ignore
    public void testao() {
        VO vo = new VO();
        try {
            for (int i = 0; i < 1; i++) {
                vo = new VO();
                mybatisTestDao.insert(vo, DbOperation.df3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Ignore
    public void test() {
        VO vo = new VO();
        try {
            for (int i = 0; i < 1; i++) {
                vo = new VO();
                mybatisTestService1.insertAll(vo, DbOperation.df1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
