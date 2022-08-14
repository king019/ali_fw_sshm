package com.k.spring.boot.util;

import com.k.spring.boot.control.BootControl;

public class PathUtil {
    public static String queryRootPath() {
        String dir = BootControl.class.getClassLoader().getResource("").getPath();
        return dir;
    }
}
