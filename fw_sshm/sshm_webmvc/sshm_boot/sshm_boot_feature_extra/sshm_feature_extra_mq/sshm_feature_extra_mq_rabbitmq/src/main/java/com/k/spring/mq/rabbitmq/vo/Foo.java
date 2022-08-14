package com.k.spring.mq.rabbitmq.vo;

import com.k.spring.mq.rabbitmq.util.ObjectAndByte;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
public class Foo implements Serializable {
    // public void listen(String foo) {
    // log.info(foo);
    // }
    private void listen(byte[] bs) {
        Object obj = ObjectAndByte.toObject(bs);
        log.info("", obj);
    }
}
