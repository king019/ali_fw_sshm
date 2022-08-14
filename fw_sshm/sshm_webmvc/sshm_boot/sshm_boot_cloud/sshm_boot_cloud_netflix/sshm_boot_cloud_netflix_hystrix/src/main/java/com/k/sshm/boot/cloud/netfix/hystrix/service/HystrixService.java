package com.k.sshm.boot.cloud.netfix.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Slf4j
@Service
public class HystrixService {
    @Autowired
    private RestTemplate restTemplate;

    //@HystrixCommand(fallbackMethod = "defaultStores")
    @HystrixCommand(groupKey = "UserGroup",
            commandKey = "GetUserByIdCommand",
            //fallbackMethod = "fallback",
            //ignoreExceptions = {BadRequestException.class} 指定哪一类异常可以忽略,不走fallback
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"),//方法执行超时时间
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//当并发错误个数达到此阀值时(在时间窗口内)，触发隔断器
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "60000"),//滚动窗口时间长度
                    @HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "12"),//滚动窗口的桶数
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "60000"),//隔断器被触发后，睡眠多长时间开始重试请求
                    //@HystrixProperty(name ="execution.isolation.strategy" ,value = "THREAD"),
                    @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE"),
            },
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "20"),
                    @HystrixProperty(name = "maxQueueSize", value = "100"),
            })

//    @HystrixCommand(threadPoolKey = "tk",commandProperties= @HystrixProperty(name ="execution.isolation.strategy" ,value = "THREAD"))
    public void index() throws InterruptedException {
        log.info("thread:{}", Thread.currentThread().getName());
        Thread.sleep(20000);
        //String body = restTemplate.getForEntity("http://feign-server/index", String.class).getBody();
        //log.info("{}",body);
        //return Maps.newHashMap();
    }

    public Map<String, String> defaultStores() {
        return Map.of();
    }

}
