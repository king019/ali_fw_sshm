package com.k.spring.test;

import com.k.spring.sshm.function.ControlTest;
import com.k.spring.sshm.function.anno.TransService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ControlTest.class)
public class SpringRunTest {

    @Autowired
    private TransService transService;

    @Ignore
    @Test
    public void test() {
        transService.service();
    }
}
