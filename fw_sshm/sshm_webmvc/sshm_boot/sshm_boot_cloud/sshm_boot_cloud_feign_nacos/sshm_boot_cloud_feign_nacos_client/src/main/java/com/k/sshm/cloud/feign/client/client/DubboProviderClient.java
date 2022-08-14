package com.k.sshm.cloud.feign.client.client;


import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "provider.dubbo")
public interface DubboProviderClient {
    @GetMapping(value = "/index")
    String index();
}