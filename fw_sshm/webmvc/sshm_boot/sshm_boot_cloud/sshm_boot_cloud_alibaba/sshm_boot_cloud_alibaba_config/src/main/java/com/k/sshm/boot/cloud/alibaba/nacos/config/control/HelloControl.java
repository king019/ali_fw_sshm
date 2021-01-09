package com.k.sshm.boot.cloud.alibaba.nacos.config.control;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class HelloControl {
    @NacosValue(value = "${config}", autoRefreshed = true)
    private String userName;
    @RequestMapping("/index")
    private Map<String, String> index() {
        return Map.of(userName,userName);
    }
}
