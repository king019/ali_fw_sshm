package com.k.spring.boot.inf.anno;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.METHOD)
public @interface Trans {
    String value();
}
