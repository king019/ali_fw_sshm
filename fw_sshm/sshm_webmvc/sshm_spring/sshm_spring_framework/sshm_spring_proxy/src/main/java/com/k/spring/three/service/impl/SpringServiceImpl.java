package com.k.spring.three.service.impl;

import com.k.spring.anno.AnnoClass;
import com.k.spring.anno.AnnoMethod;
import com.k.spring.three.service.SpringService;
import org.springframework.stereotype.Controller;

@Controller
@AnnoClass
public class SpringServiceImpl implements SpringService {
    @Override
    public void service() {
    }

    @Override
    @AnnoMethod
    public void test() {
    }
}
