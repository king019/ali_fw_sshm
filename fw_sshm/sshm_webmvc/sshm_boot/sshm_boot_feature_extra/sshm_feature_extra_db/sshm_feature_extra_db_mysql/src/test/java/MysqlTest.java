import com.google.common.base.Stopwatch;
import com.k.spring.SpringFeatureMysqlRun;
import com.k.spring.boot.service.BootService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringFeatureMysqlRun.class)
public class MysqlTest {

    @Autowired
    private BootService bootService;

    @Ignore
    @Test
    public void test() {
        int num = 10000;
        bootService.insert();
        Stopwatch stopwatch1 = Stopwatch.createStarted();
        for (int i = 0; i < num; i++) {
            bootService.insert();
        }
        long elapsed = stopwatch1.elapsed(TimeUnit.MICROSECONDS);
        log.info("insert num:{},times:{}", num, elapsed);
        Stopwatch stopwatch2 = Stopwatch.createStarted();
        for (int i = 0; i < num; i++) {
            bootService.insertWhtiTrans();
        }
        elapsed = stopwatch2.elapsed(TimeUnit.MICROSECONDS);
        log.info("insertWhtiTrans num:{},times:{}", num, elapsed);
        Stopwatch stopwatch3 = Stopwatch.createStarted();
        for (int i = 0; i < num; i++) {
            bootService.query();
        }
        elapsed = stopwatch3.elapsed(TimeUnit.MICROSECONDS);
        log.info("query num:{},times:{}", num, elapsed);

        Stopwatch stopwatch4 = Stopwatch.createStarted();
        for (int i = 0; i < num; i++) {
            bootService.queryWithTrans();
        }
        elapsed = stopwatch4.elapsed(TimeUnit.MICROSECONDS);
        log.info("queryWithTrans num:{},times:{}", num, elapsed);
    }

}
