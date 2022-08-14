package annotest.anno;

import com.k.spring.bean.BeanDemo;
import com.k.spring.bean.child.BeanDemoChild;
import com.k.spring.point.anno.AopPointTest;
import com.k.spring.vo.BeanVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class AnnoTest {
    public static void main(String[] args) {
        try {
            ApplicationContext cx = new ClassPathXmlApplicationContext("classpath:/spring/anno/application*.xml");
            // AopPointTest pt = cx.getBean(AopPointTest.class);
            AopPointTest pt = (AopPointTest) cx.getBean("aopPointTest");
            BeanVO bean1 = (BeanVO) cx.getBean("factoryBeanDemo");
            BeanVO bean2 = (BeanVO) cx.getBean("factoryBeanDemo");
            BeanDemo bean3 = cx.getBean(BeanDemo.class);
            BeanDemoChild bean4 = cx.getBean(BeanDemoChild.class);
            log.info(bean1 + "_" + bean2 + "" + bean3 + bean4);
            pt.aoptest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
