package com.k.spring.load.test;

import com.k.spring.load.SpringFeatureLoadOrderRunner;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringFeatureLoadOrderRunner.class)
public class SpringFeatureLoadOrderRunnerTest {
    @Value("yml.env")
    private String val;

    @Ignore
    @Test
    public void test() {
        log.info(val);
    }

}
