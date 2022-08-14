package com.junit.test;

import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.service.MybatisTestService1;
import com.k.web.mybatis.util.DbOperation;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
// @TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
// @Transactional(timeout = 1)
public class TsetCache {

    @Resource
    public MybatisTestService1 mybatisTestService1;
    String param = "vname" + System.currentTimeMillis();

    public void insert() throws Exception {
        VO vo = new VO();
        try {
            mybatisTestService1.insertAll(vo, DbOperation.df1);
        } catch (Exception e) {
        }
    }

    public void select() throws Exception {
        VO vo = new VO();
        try {
            List<VO> vos = mybatisTestService1.selectMap(vo, DbOperation.df1);
            log.info("{}", vos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Ignore
    public void test() {
        try {
            // SqlSessionTemplate
            select();
            select();
            // insert();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
