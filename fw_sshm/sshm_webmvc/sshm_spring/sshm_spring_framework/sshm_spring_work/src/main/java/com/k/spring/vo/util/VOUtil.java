package com.k.spring.vo.util;

import org.springframework.beans.factory.annotation.Value;

public class VOUtil {
    @Value("#{prop[file_root]}")
    public String name;
}
