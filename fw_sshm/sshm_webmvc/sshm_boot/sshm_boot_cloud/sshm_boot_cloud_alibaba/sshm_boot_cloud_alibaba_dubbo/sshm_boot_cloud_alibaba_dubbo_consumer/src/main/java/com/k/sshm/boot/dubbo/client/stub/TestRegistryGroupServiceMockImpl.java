package com.k.sshm.boot.dubbo.client.stub;

import com.k.rpc.dubbo.anno.api.model.Person;
import com.k.rpc.dubbo.anno.api.service.group.TestRegistryGroupService;

import java.util.List;

public class TestRegistryGroupServiceMockImpl implements TestRegistryGroupService {
    private TestRegistryGroupService testRegistryGroupService;

    @Override
    public List<String> helloGroup1(String name) {
        return testRegistryGroupService.helloGroup1(name);
    }

    @Override
    public List<String> helloGroup2(Person persion) {
        return testRegistryGroupService.helloGroup2(persion);
    }
}
