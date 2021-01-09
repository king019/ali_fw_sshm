package com.k.spring.service.impl;

import com.k.spring.service.SpringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("springServiceImpl1")
public class SpringServiceImpl1 implements SpringService {
    @Resource
    private SpringService impl2;

}
