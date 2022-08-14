package com.k.web.mybatis.plugins.executor;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Properties;

@Intercepts({@Signature(type = Executor.class, method = "deferLoad", args = {MappedStatement.class, MetaObject.class, String.class, CacheKey.class, Class.class})})
public class Executor_deferLoad_plugin implements Interceptor {
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