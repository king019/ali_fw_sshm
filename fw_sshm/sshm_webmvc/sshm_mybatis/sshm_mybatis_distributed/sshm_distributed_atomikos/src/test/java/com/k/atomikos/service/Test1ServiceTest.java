package com.k.atomikos.service;

import com.k.atomikos.JtaApplicationRun;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JtaApplicationRun.class)
@Transactional(transactionManager = "xatx")
public class Test1ServiceTest {
    @Autowired
    private Test1Service test1Service;

    @Ignore
    @Test
    public void testTest() {
        test1Service.save();
    }

}
