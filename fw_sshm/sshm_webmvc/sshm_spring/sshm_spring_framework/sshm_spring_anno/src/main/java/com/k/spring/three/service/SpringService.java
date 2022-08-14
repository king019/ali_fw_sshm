package com.k.spring.three.service;

import com.k.spring.anno.Anno1;
import com.k.spring.anno.Anno2;

@Anno1
public interface SpringService {
    @Anno2
    public void test();

    public void service();
}
