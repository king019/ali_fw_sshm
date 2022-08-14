package com.k.sshm.boot.cloud.dubbo.server.impl;

import com.k.dep.common.util.NetworkUtils;
import com.k.rpc.dubbo.anno.api.model.Person;
import com.k.rpc.dubbo.anno.api.service.single.TestRegistrySingleService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1")
//(version = "1.1")
//(executes = 10 ,delay = 10)
public class TestRegistrySingleServiceImpl1 implements TestRegistrySingleService {
    @Override
    public String helloSingle1(String name) throws Exception {
        return NetworkUtils.getHostIP() + name + "_OK";
    }

    @Override
    public String helloSingle2(Person persion) {
        return NetworkUtils.getHostIP() + persion.toString();
    }
}
