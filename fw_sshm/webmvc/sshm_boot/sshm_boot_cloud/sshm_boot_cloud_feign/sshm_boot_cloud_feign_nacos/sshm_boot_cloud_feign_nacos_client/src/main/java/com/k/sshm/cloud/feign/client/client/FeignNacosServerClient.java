package com.k.sshm.cloud.feign.client.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feign-nacos-server")
public interface FeignNacosServerClient {
    @GetMapping(value = "/index")
    String index();
}