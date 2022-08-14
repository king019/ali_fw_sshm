package com.k.sshm.cloud.feign.client.client;


import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "consumer.dubbo")
public interface DubboConsumerClient {
    @GetMapping(value = "/index")
    String index();
}