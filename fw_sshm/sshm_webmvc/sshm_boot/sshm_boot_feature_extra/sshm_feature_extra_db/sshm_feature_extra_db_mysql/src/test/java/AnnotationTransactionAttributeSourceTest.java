import com.k.spring.boot.dao.BootDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;

import java.lang.reflect.Method;

@Slf4j
public class AnnotationTransactionAttributeSourceTest {
    @Ignore
    @Test
    public void test() throws NoSuchMethodException {
        Class<BootDao> clazz = BootDao.class;
        Method query = clazz.getMethod("query");
        AnnotationTransactionAttributeSource anno = new AnnotationTransactionAttributeSource();
        log.info("{}", anno.getTransactionAttribute(query, clazz));
    }
}
