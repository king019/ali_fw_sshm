package com.k.sshm.grpc.client.controller;

import com.k.sshm.grpc.client.client.GrpcClientService;
import com.k.sshm.grpc.client.client.SimpleGrpcService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloControl {

    @Autowired
    private SimpleGrpcService simpleGrpcService;

    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/index")
    private Object index(String name) {
        String def1 = grpcClientService.sendMessage(StringUtils.defaultString(name, "def"));
        String def2 = grpcClientService.sendMessage(StringUtils.defaultString(name, "def"));
        return def1+def2;
    }
}
