package com.k.web.mybatis.plugins.resultsethandler;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;

import java.sql.CallableStatement;
import java.util.Properties;

@Intercepts({@Signature(type = ResultSetHandler.class, method = "handleOutputParameters", args = {CallableStatement.class})})
public class ResultSetHandler_handleOutputParameters_plugin implements Interceptor {
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