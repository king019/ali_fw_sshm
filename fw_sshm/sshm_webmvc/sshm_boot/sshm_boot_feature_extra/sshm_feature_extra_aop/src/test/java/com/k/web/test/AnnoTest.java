package com.k.web.test;

import com.k.spring.aop.SpringFeatureAopRun;
import com.k.spring.aop.point.service.SpringService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringFeatureAopRun.class)
public class AnnoTest {

    @Autowired
    private SpringService springService;

    @Ignore
    @Test
    public void test() {
        springService.service();
    }

}
