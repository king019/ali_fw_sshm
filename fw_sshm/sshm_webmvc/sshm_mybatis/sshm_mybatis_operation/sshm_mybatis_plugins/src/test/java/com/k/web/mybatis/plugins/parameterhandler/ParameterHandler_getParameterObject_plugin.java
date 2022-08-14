package com.k.web.mybatis.plugins.parameterhandler;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

@Intercepts({@Signature(type = ParameterHandler.class, method = "getParameterObject", args = {})})
public class ParameterHandler_getParameterObject_plugin implements Interceptor {
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