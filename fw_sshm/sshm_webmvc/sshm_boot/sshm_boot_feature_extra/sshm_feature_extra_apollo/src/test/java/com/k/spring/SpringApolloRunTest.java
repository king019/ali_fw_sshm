package com.k.spring;

import com.k.spring.boot.control.SpringControl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringApolloRun.class)

public class SpringApolloRunTest {

    @Autowired
    private SpringControl springControl;

    @Ignore
    @Test
    public void test() {
        log.info("timeout:{}", springControl.getTimeout());

    }
}
