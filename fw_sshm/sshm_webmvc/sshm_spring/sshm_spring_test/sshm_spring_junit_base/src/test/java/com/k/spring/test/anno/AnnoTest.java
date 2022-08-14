package com.k.spring.test.anno;

import com.k.spring.util.UtilDemo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml", "classpath:spring/anno/spring-*.xml"})
public class AnnoTest {

    @Resource
    ApplicationContext context;
    @Resource
    private UtilDemo demo;

    @Test
    @Ignore
    public void test() {
        log.info(demo.getFilePathAnnoXml());
    }
}
