package com.k.rpc.dubbo.anno.api.callback;


public interface CallbackService {
    void addListener(String key, CallbackListener listener);
}