package com.k.sshm.processor.smartlifecycle.impl;

import org.springframework.context.SmartLifecycle;

public class SmartLifeCycleImpl implements SmartLifecycle {

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");

    }

    @Override
    public boolean isRunning() {
        return true;
    }
}
