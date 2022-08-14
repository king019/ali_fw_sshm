package com.k.rpc.dubbo.anno.api.service.single;


import com.k.rpc.dubbo.anno.api.model.Person;

public interface TestRegistrySingleService {
    String helloSingle1(String name) throws Exception;

    default String helloSingle1(Person persion) throws Exception {
        return "default";
    }

    String helloSingle2(Person persion);
}