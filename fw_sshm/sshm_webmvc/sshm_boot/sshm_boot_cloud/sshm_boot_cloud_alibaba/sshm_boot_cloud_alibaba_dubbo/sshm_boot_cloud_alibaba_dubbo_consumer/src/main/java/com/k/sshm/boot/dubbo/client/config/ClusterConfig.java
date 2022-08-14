package com.k.sshm.boot.dubbo.client.config;

import org.apache.dubbo.rpc.cluster.Cluster;
import org.apache.dubbo.rpc.cluster.support.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 集群容错
 */
@Configuration
public class ClusterConfig {
    @Bean
    public Cluster failfast() {
        return new FailfastCluster();
    }

    @Bean
    public Cluster failsafe() {
        return new FailsafeCluster();
    }

    @Bean
    public Cluster failback() {
        return new FailbackCluster();
    }

    @Bean
    public Cluster forking() {
        return new ForkingCluster();
    }

    @Bean
    public Cluster broadcast() {
        return new BroadcastCluster();
    }

}
