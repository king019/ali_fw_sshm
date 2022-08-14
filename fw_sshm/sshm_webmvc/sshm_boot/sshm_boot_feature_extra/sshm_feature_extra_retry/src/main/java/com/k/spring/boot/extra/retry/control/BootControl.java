package com.k.spring.boot.extra.retry.control;

import com.k.spring.boot.extra.retry.service.RetryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
public class BootControl {
    @Autowired
    public RetryServiceImpl retryServiceImpl;

    @PostConstruct
    public void testRetry() {
        try {
            retryServiceImpl.retry();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
