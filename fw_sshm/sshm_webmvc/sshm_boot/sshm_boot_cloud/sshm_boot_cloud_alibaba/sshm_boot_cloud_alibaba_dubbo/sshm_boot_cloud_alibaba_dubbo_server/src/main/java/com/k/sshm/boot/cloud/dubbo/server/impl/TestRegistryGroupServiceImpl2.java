package com.k.sshm.boot.cloud.dubbo.server.impl;

import com.k.dep.common.util.NetworkUtils;
import com.k.rpc.dubbo.anno.api.model.Person;
import com.k.rpc.dubbo.anno.api.service.group.TestRegistryGroupService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

@DubboService(version = "2")
//(group = "bb",loadbalance = "consistenthash")
public class TestRegistryGroupServiceImpl2 implements TestRegistryGroupService {
    @Override
    public List<String> helloGroup1(String name) {
        return List.of(NetworkUtils.getHostIP() + name);
    }

    @Override
    public List<String> helloGroup2(Person persion) {
        return List.of(NetworkUtils.getHostIP() + persion.toString());
    }
}
