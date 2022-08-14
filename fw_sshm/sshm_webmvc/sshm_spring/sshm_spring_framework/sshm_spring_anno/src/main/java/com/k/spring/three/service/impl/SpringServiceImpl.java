package com.k.spring.three.service.impl;

import com.k.spring.three.buness.SpringBuness;
import com.k.spring.three.buness.impl.SpringBunessImpl;
import com.k.spring.three.service.SpringService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class SpringServiceImpl implements SpringService {
    @Resource(type = SpringBunessImpl.class, name = "springBunessImpl")
    private SpringBuness springBuness;

    @Override
    public void service() {
    }

    @Override
    public void test() {
    }
}
