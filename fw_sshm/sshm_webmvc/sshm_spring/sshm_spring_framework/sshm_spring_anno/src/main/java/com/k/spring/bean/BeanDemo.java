package com.k.spring.bean;

import com.k.spring.bean.child.BeanDemoChild;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BeanDemo {
    // private BeanDemoChild1 beanDemoChild1;
    // @Autowired
    private BeanDemoChild beanDemoChild;

    // private BeanDemoChild beanDemoChildXml;
    public void test() {
        log.info("{}", beanDemoChild);
        // log.info(beanDemoChildXml);
    }

    public BeanDemoChild getBeanDemoChild() {
        return beanDemoChild;
    }

    public void setBeanDemoChild(BeanDemoChild beanDemoChild) {
        this.beanDemoChild = beanDemoChild;
    }
    // public BeanDemoChild getBeanDemoChildXml() {
    // return beanDemoChildXml;
    // }
    // public void setBeanDemoChildXml(BeanDemoChild beanDemoChildXml) {
    // this.beanDemoChildXml = beanDemoChildXml;
    // }
    // public BeanDemoChild1 getBeanDemoChild1() {
    // return beanDemoChild1;
    // }
    // public void setBeanDemoChild1(BeanDemoChild1 beanDemoChild1) {
    // this.beanDemoChild1 = beanDemoChild1;
    // }
}
