package com.k.web.mybatis.plugins.statementhandler;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

@Intercepts({@Signature(type = StatementHandler.class, method = "getBoundSql", args = {})})
public class StatementHandler_getBoundSql_plugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }
}