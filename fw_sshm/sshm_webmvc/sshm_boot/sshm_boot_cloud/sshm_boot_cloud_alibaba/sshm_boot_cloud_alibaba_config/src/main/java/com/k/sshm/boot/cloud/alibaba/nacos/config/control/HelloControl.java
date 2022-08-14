package com.k.sshm.boot.cloud.alibaba.nacos.config.control;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope
@Data
public class HelloControl {


    @Value("${blog.name:}")
    private String blogName;

    @GetMapping("/index")
    public String get() {
        log.info("{}", blogName);
        return "ConfigController#get blog name = " + getBlogName();
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }
}
