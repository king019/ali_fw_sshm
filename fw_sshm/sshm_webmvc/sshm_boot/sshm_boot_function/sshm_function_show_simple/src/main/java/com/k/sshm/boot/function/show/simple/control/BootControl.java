package com.k.sshm.boot.function.show.simple.control;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@RestController
public class BootControl {
    private OkHttpClient client = new OkHttpClient();
    @Value("server.port")
    private String port;
    @Value("${prop.name}")
    private String propName;

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return propName;
    }

    @GetMapping("/exp")
    @ResponseBody
    public String exp() {
        return propName;
    }

    @GetMapping("/lock")
    @ResponseBody
    public String lock() {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Lock readLock = lock.readLock();
        Lock writeLock = lock.writeLock();
        readLock.lock();
        writeLock.lock();
        return propName;
    }

    @GetMapping("/waitLong")
    @ResponseBody
    public String waitLong() throws Exception {
        Thread.sleep(100000000);
        return propName;
    }

    @GetMapping("/wait")
    @ResponseBody
    public String waitUrl() throws Exception {

        client.newCall(new Request.Builder().url("http://127.0.0.1:8999/waitLong").build()).execute();
        return propName;
    }
}
