package com.k.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class SpringServiceImpl1 {
    @Value("张三")
    private String name;
    @Autowired
    private SpringServiceImpl2 springServiceImpl2;
    @Autowired
    private List<SpringServiceImpl2> springServiceImpl2s;
    @Autowired
    private Map<String, SpringServiceImpl2> springServiceImpl2Map;

}
