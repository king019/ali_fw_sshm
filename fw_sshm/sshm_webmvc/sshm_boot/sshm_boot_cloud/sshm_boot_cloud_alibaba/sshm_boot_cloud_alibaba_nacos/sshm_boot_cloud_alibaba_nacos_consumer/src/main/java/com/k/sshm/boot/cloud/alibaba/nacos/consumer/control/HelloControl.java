package com.k.sshm.boot.cloud.alibaba.nacos.consumer.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class HelloControl {
    //@Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    private String index() {
        //ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        String path = "http://nacos-provider/index";
        //String.format("http://nacos-provider/index", serviceInstance.getHost(), serviceInstance.getPort(), "consumer");
        System.out.println("request path:" + path);
        return restTemplate.getForObject(path, String.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
