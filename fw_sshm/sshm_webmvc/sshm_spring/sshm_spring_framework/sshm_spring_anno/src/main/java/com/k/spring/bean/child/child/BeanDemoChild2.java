package com.k.spring.bean.child.child;

import com.k.spring.bean.child.BeanDemoChild;
import org.springframework.stereotype.Component;

@Component
public class BeanDemoChild2 extends BeanDemoChild {
    private long curentTime = System.nanoTime();

    public long getCurentTime() {
        return curentTime;
    }

    public void setCurentTime(long curentTime) {
        this.curentTime = curentTime;
    }
}
