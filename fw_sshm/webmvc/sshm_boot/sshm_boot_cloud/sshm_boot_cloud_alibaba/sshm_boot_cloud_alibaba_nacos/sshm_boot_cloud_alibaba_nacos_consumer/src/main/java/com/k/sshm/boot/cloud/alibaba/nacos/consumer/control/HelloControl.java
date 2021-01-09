package com.k.sshm.boot.cloud.alibaba.nacos.consumer.control;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Slf4j
@RestController
public class HelloControl {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/index")
    private String index() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        String path = String.format("http://%s:%s/index",serviceInstance.getHost(),serviceInstance.getPort(),"consumer");
        System.out.println("request path:" +path);
        return restTemplate.getForObject(path,String.class);
    }
    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
