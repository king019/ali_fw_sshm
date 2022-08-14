import com.k.spring.SpringFeatureMysqlRun;
import com.k.spring.boot.service.BootService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringFeatureMysqlRun.class)
public class MysqlSingleTest {

    @Autowired
    private BootService bootService;

    @Ignore
    @Test
    public void test() {
        bootService.insert();
        bootService.insertWhtiTrans();
        bootService.query();
        bootService.queryWithTrans();
    }

}
