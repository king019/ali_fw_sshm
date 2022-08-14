package com.k.rpc.dubbo.anno.api.service.group;


import com.k.rpc.dubbo.anno.api.model.Person;

import java.util.List;

public interface TestRegistryGroupService {
    List<String> helloGroup1(String name);

    List<String> helloGroup2(Person persion);
}