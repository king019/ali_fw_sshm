package com.k.sshm.boot.cloud.alibaba.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class HelloService {
    @SentinelResource("hello")
    public Map<String, String> index() {
        return Maps.newHashMap();
    }
}
