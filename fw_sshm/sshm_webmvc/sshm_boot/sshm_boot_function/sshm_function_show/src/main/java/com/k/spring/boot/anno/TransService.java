package com.k.spring.boot.anno;

import com.k.spring.boot.inf.anno.Trans;

public interface TransService {
    @Trans("interface")
    void service();
}
