package com.k.sshm.boot.cloud.netfix.hystrix.control;

import com.google.common.collect.Maps;
import com.k.sshm.boot.cloud.netfix.hystrix.service.HystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class HelloControl {

    //    @Autowired
//    private DiscoveryClient client;
//    @Autowired
//    private EurekaClient eurekaClient;
    @Autowired
    private HystrixService hystrixService;

    //    @HystrixCommand(fallbackMethod = "defaultStores")
    @GetMapping("/index")
    private Map<String, String> index() throws InterruptedException {
        log.info("thread:{}", Thread.currentThread().getName());
        hystrixService.index();
//        InstanceInfo next = eurekaClient.getNextServerFromEureka("hellow-service", false);
//        List<ServiceInstance> instances = client.getInstances("hellow-service");
//        for (ServiceInstance instance : instances) log.info("{}", instance.getHost());
//        List<String> services = client.getServices();
        //ServiceInstance instance = client.getLocalServiceInstance();
        //log.info("host:{},serviceid:{}",instance.getHost(),instance.getServiceId());
        return Maps.newHashMap();
    }

}
