package com.k.spring.bean.child.child;

import com.k.spring.bean.child.BeanDemoChild;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BeanDemoChild1 extends BeanDemoChild {
    private long curentTime = System.nanoTime();
}
