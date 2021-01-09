package com.k.spring.boot.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceServerImpl1 implements ServiceServer1 {
    @Autowired
    private ServiceServer2 serviceServer2;
}
