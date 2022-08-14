package com.k.spring.sshm.function.anno;


import com.k.spring.sshm.function.inf.anno.Trans;

public interface TransService {
    @Trans("interface")
    void service();
}
