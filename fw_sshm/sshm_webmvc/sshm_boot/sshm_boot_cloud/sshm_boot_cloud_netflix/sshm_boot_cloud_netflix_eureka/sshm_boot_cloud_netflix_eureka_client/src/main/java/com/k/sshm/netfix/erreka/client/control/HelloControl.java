package com.k.sshm.netfix.erreka.client.control;

import com.google.common.collect.Maps;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class HelloControl {

    @Autowired
    private DiscoveryClient client;
    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/index")
    private Map<String, String> index() {
        InstanceInfo next = eurekaClient.getNextServerFromEureka("hellow-service", false);
        List<ServiceInstance> instances = client.getInstances("hellow-service");
        for (ServiceInstance instance : instances) {
            log.info("{}", instance.getHost());
        }
        List<String> services = client.getServices();
        //ServiceInstance instance = client.getLocalServiceInstance();
        //log.info("host:{},serviceid:{}",instance.getHost(),instance.getServiceId());
        return Maps.newHashMap();
    }
}
