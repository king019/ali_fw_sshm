package com.k.cs;

import com.k.spring.boot.FunctionShow;
import com.k.spring.boot.async.AsyncService;
import com.k.spring.boot.control.BootControl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FunctionShow.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringTest {

    @MockBean
    private BootControl bootControl;
    @Autowired
    private AsyncService asyncService;

    @Ignore
    @Test
    public void test() {
        log.info("{}", bootControl.deleteUser(10L));
    }

    @Ignore
    @Test
    public void async() {
        asyncService.asyncCs();
    }
}
