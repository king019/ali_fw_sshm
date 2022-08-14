package com.k.web.mybatis.base.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 参数传递类
 */
@Data
public class ParamObj implements Serializable {
    private static final long serialVersionUID = 8408371340405783798L;
    // 所应用的sqlSessionFactory
    private String ds;
    // 执行的sqlId
    private String sqlId;
    // sql语句所需要的参数
    private Object condition;
    private String countSqlId;
    private String countSql;
    // 分页的开始记录数
    private int start;
    // 分页的结束记录数
    private int end;
    // 分页的每页限制（和PageBean中的pageSize一致）
    private int limit;
}
