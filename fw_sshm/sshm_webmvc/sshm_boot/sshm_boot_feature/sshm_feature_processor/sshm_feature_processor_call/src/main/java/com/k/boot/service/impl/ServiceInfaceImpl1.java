package com.k.boot.service.impl;

import com.k.boot.anno.CheckAccessType;
import com.k.boot.service.ServiceInface;
import org.springframework.stereotype.Service;

@Service
@CheckAccessType(type = ServiceInface.class)
public class ServiceInfaceImpl1 implements ServiceInface {

    @Override
    public void test() {

    }
}
