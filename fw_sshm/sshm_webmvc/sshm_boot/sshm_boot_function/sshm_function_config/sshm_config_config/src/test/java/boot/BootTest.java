package boot;

import com.k.spring.ControlTest;
import com.k.spring.boot.async.AsyncService;
import com.k.spring.boot.control.SpringControl;
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
    private AsyncService asyncService;
    @Autowired
    private SpringControl springControl;

    @Ignore
    @Test
    public void test() {
        springControl.insert(123);
    }
}
