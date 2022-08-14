package boot;

import com.k.spring.ControlTest;
import com.k.spring.boot.data.jdbc.dao.SpringDao;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ControlTest.class)
public class BootTest {

    @Autowired
    private SpringDao springDao;

    @Ignore
    @Test
    public void test() {
        springDao.insert();
    }
}
