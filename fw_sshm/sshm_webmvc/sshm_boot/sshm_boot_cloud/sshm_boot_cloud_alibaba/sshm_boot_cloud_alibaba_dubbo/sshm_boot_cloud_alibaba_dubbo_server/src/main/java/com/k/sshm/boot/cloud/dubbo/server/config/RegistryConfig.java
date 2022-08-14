package com.k.sshm.boot.cloud.dubbo.server.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.protocol.dubbo.DubboProtocol;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableDubbo(scanBasePackages = "com.k.dubbo.service.impl")
public class RegistryConfig {
//    @Bean
//    public Registry registry() {
//        return new RedisRegistry(URL.valueOf("redis://smp:6379"));
//    }

    @Bean
    public ApplicationConfig config() {
        return new ApplicationConfig("service");
    }

    @Bean
    public Protocol protocol() {
        return new DubboProtocol();
    }

    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(1000);
        return providerConfig;
    }
}
