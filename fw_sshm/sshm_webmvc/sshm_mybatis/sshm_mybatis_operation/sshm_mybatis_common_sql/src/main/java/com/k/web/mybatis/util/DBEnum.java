package com.k.web.mybatis.util;

public enum DBEnum {
    cscenter("cscenter");
    private String dbName;

    private DBEnum(String dbName) {
        this.dbName = dbName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}
