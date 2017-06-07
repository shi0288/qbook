package com.mcp.qbook.core.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.sql.Connection;
import java.util.Properties;

/**
 * Created by shiqm on 2017/6/7.
 */
@Intercepts({
        @Signature(method = "query", type = Executor.class, args = { MappedStatement.class, Object.class,
                RowBounds.class, ResultHandler.class }),
        @Signature(method = "selectCountry", type = StatementHandler.class, args = { Connection.class }) })
public class SimpleInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        System.out.println("intercept");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        System.out.println("plugin");
        if(true){
            return Plugin.wrap(o, this);
        }
        return o;
    }

    @Override
    public void setProperties(Properties properties) {
        System.out.println("properties");

    }
}
