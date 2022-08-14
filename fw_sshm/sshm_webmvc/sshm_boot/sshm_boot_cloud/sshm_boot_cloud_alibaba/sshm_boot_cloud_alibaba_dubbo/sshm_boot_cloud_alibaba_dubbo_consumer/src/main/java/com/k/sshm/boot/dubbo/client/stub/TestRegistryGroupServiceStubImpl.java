package com.k.sshm.boot.dubbo.client.stub;

import com.k.rpc.dubbo.anno.api.model.Person;
import com.k.rpc.dubbo.anno.api.service.group.TestRegistryGroupService;

import java.util.List;

public class TestRegistryGroupServiceStubImpl implements TestRegistryGroupService {
    private TestRegistryGroupService testRegistryGroupService;

    // 构造函数传入真正的远程代理对象
    public TestRegistryGroupServiceStubImpl(TestRegistryGroupService testRegistryGroupService) {
        this.testRegistryGroupService = testRegistryGroupService;
    }

    @Override
    public List<String> helloGroup1(String name) {
        return testRegistryGroupService.helloGroup1(name);
    }

    @Override
    public List<String> helloGroup2(Person persion) {
        return testRegistryGroupService.helloGroup2(persion);
    }
}
