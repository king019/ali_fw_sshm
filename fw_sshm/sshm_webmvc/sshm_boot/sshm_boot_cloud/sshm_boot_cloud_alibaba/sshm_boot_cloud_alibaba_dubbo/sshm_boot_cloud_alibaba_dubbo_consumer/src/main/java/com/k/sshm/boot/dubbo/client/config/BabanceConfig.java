package com.k.sshm.boot.dubbo.client.config;

import org.apache.dubbo.rpc.cluster.LoadBalance;
import org.apache.dubbo.rpc.cluster.loadbalance.ConsistentHashLoadBalance;
import org.apache.dubbo.rpc.cluster.loadbalance.LeastActiveLoadBalance;
import org.apache.dubbo.rpc.cluster.loadbalance.RandomLoadBalance;
import org.apache.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 负责均衡
 */
@Configuration
public class BabanceConfig {
    /**
     * 随机
     */
    @Bean
    public LoadBalance random() {
        return new RandomLoadBalance();
    }

    /**
     * 轮训
     */
    @Bean
    public LoadBalance roundRobin() {
        return new RoundRobinLoadBalance();
    }

    /**
     * 最少活跃调用数
     */
    @Bean
    public LoadBalance leastActive() {
        return new LeastActiveLoadBalance();
    }

    /**
     * 一致性hash
     */
    @Bean
    public LoadBalance consistentHash() {
        return new ConsistentHashLoadBalance();
    }

}
