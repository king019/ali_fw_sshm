package com.k.sshm.cloud.feign.client.client;


import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient("feign-server")
public interface StoreClient {
    @GetMapping(value = "/index")
    String index();
}