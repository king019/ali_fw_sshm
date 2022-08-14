package com.k.sshm.cloud.feign.client.control;

import com.k.sshm.cloud.feign.client.client.FeignNacosServerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BootControl {
//    @Autowired
//    private DubboProviderClient dubboProviderClient;

    @Autowired
    private FeignNacosServerClient feignNacosServerClient;

    @GetMapping(value = "/index")
    String index() {
        //dubboProviderClient.index();
        feignNacosServerClient.index();
        return "ok";
    }
}
