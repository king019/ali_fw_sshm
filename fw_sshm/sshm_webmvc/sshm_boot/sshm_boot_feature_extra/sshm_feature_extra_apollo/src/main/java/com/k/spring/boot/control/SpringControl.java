package com.k.spring.boot.control;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringControl {

    @Getter
    @Value("${timeout}")
    private String timeout;
    @ApolloConfig
    private Config config;

    @GetMapping("/index")
    @ResponseBody
    public String index(String key) {
        return config.getProperty(key, "def");
    }
}
