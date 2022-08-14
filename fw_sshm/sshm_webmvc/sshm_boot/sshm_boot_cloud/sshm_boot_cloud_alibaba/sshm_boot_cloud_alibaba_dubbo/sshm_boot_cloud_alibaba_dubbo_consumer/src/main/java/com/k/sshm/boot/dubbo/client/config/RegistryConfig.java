package com.k.sshm.boot.dubbo.client.config;

import org.apache.dubbo.config.ConsumerConfig;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.protocol.dubbo.DubboProtocol;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableDubbo(scanBasePackages = "com.k.dubbo.service.impl")
public class RegistryConfig {
//    @Bean
//    public Registry registry() {
//        return new RedisRegistry(URL.valueOf("redis://redis:6379"));
//    }

//    //@Bean
//    public ApplicationConfig config() {
//        return new ApplicationConfig("api");
//    }

    /**
     * todo 线程模型
     * dispatcher   threadpool
     *
     * @return
     */
    @Bean
    public Protocol protocol() {
        DubboProtocol dubboProtocol = new DubboProtocol();
        return dubboProtocol;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(1000);
        return consumerConfig;
    }

}
