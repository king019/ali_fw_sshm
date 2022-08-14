package com.k.web.mybatis.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DbOperation {
    df1("df1"), df2("df2"), df3("df3");
    private String val;
}
