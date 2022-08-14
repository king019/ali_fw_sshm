package com.k.boot;


import com.k.boot.selector.StudentBean;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringFeatureImportSelectorRun.class)
public class SpringRunTest {
    @Autowired
    private StudentBean studentBean;

    @Ignore
    @Test
    public void test() {
        log.info("{}", studentBean);
    }

}
