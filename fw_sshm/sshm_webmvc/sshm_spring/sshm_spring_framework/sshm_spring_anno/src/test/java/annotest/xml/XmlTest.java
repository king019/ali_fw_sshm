package annotest.xml;

import com.k.spring.bean.BeanDemo;
import com.k.spring.point.xml.AopPointTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {
    public static void main(String[] args) {
        ApplicationContext cx = new ClassPathXmlApplicationContext("classpath:/spring/xml/application*.xml");
        // AopPointTest pt = cx.getBean(AopPointTest.class);
        AopPointTest pt = (AopPointTest) cx.getBean("aopPointTest");
        BeanDemo beanDemo = (BeanDemo) cx.getBean("beanDemo");
        pt.aoptest();
        beanDemo.test();
    }
}
