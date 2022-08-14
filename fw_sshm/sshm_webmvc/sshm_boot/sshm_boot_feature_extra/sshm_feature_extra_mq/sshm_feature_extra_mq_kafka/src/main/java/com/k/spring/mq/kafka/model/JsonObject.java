package com.k.spring.mq.kafka.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonObject implements Serializable {
    private String name;
    private Integer favoriteNumber;
    private String favoriteColor;
}
