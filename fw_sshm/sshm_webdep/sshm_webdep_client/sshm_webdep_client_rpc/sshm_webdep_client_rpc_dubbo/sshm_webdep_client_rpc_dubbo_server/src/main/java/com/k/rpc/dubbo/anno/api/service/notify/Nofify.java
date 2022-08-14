package com.k.rpc.dubbo.anno.api.service.notify;


import com.k.rpc.dubbo.anno.api.model.Person;

public interface Nofify {
    void onreturn(Person msg, String id);

    void onthrow(Throwable ex, String id);
}
