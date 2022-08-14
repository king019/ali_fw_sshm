package com.k.web.mybatis.util.jc;

import com.k.web.mybatis.dao.MybatisTestDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class JC {

    public static ApplicationContext context;
    public static MybatisTestDao dao;

    @Before
    public void setUp() throws Exception {
        try {
            context = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-hibernate.xml");
            dao = context.getBean(MybatisTestDao.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    @Ignore
    public abstract void test();
}
