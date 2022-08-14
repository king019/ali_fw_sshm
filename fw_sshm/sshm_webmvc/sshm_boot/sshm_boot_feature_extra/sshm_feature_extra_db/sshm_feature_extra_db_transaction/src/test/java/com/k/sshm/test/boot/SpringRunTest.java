package com.k.sshm.test.boot;

import com.k.web.mybatis.SpringRun;
import com.k.web.mybatis.mybatis.model.MybatisTable1;
import com.k.web.mybatis.service.MybatisTestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@Slf4j
@SpringBootTest(classes = SpringRun.class)
@RunWith(SpringRunner.class)
public class SpringRunTest {

    @Autowired
    private MybatisTestService mybatisTestService;

    @Ignore
    @Test
    public void test() throws Exception {
        MybatisTable1 vo = new MybatisTable1();
        vo.setMybatisId1(1);
        vo.setMybatisName1("name");
        vo.setMybatisTime1(new Date());
        mybatisTestService.insert(vo);
        log.info("endddddd");
    }
}
