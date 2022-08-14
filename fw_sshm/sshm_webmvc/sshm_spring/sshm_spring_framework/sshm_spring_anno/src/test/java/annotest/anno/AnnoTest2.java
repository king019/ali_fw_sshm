package annotest.anno;

import com.k.spring.three.buness.SpringBuness;
import com.k.spring.three.dao.SpringDao;
import com.k.spring.three.service.SpringService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Method;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/anno/application*.xml"})
public class AnnoTest2 {

    @Autowired
    private SpringService springService;
    @Autowired
    private SpringDao springDao;
    @Autowired
    private SpringBuness springBuness;

    @Test
    @Ignore
    public void test() {
        try {
            method();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void method() throws Exception {
        Class serviceClazz = springService.getClass();
        Class bunessClazz = springBuness.getClass();
        Class daoClazz = springDao.getClass();
        Method serviceTest = serviceClazz.getMethod("test");
        Method bunessTest = bunessClazz.getMethod("test");
        Method daoTest = daoClazz.getMethod("test");
        log.info("", serviceTest);
        log.info("", bunessTest);
        log.info("", daoTest);
    }
}
