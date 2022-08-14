package com.k.spring.boot.anno.impl;

import com.k.spring.boot.anno.TransService;
import com.k.spring.boot.inf.anno.Trans;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransServiceImpl implements TransService {
    @Override
    @Trans("class")
    public void service() {
        log.info("service");
    }
}
