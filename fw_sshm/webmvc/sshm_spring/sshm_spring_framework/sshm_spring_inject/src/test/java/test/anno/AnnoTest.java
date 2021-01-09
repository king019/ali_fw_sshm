package test.anno;
import com.k.spring.inject.InjectBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Slf4j
public class AnnoTest {
  public static void main(String[] args) {
    try {
      @SuppressWarnings("resource")
      ApplicationContext cx = new ClassPathXmlApplicationContext("classpath:/spring/anno/application*.xml");
      InjectBean bean = cx.getBean(InjectBean.class);
      log.info("",bean);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
