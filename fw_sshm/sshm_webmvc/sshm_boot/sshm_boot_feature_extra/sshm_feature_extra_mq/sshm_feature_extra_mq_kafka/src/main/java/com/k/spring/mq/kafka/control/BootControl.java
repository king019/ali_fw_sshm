package com.k.spring.mq.kafka.control;

import com.k.spring.mq.kafka.send.SenderKafka;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class BootControl {
    @Autowired
    private SenderKafka senderKafka;

    @GetMapping(value = "/index")
    public Map<String, String> index() {
        return Map.of("k", "v");
    }

    @GetMapping(value = "/send")
    public Map<String, String> send() {
        senderKafka.send();
        return Map.of("k", "v");
    }

}
