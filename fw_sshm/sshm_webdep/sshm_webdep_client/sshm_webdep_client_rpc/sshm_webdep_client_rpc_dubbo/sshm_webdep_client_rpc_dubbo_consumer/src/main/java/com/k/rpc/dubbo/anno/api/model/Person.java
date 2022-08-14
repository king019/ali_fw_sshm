package com.k.rpc.dubbo.anno.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private String id;
    private String name;
}
