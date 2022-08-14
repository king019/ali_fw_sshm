package com.test;

import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.service.MybatisTestService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
// @Transactional(timeout = 1)
public class Tset {

    @Resource
    public MybatisTestService mybatisTestService;

    public void select() throws Exception {
        // AbstractPlatformTransactionManager
        // AbstractPlatformTransactionManager
        VO vo = new VO();
        mybatisTestService.insertAll(vo);
        // SpringManagedTransaction
        // mybatisTestService.update(vo);
        // mybatisTestService.delete(vo);
        // List<VO> list = mybatisTestService.select(vo);
        // log.info(list);
    }

    @Test
    @Ignore
    public void test() {
        try {
            select();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
