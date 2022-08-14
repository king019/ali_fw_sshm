package com.k.cs;

import com.k.spring.boot.control.BootControl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BootControl.class)
public class SpringAnnoTest {

    @MockBean
    private BootControl bootControl;

    @Ignore
    @Test
    public void test() {
        log.info("{}", bootControl.deleteUser(10L));
    }
}
