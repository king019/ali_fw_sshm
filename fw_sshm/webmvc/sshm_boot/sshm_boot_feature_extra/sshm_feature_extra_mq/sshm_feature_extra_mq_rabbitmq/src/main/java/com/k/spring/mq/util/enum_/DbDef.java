package com.k.spring.mq.util.enum_;

import lombok.Getter;
import lombok.Setter;

public enum DbDef {
    DF1("df1");
    @Getter
    @Setter
    private String dbName;

    private DbDef(String dbName) {
        this.dbName = dbName;
    }
}
