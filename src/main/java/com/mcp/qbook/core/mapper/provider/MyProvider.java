package com.mcp.qbook.core.mapper.provider;

import com.mcp.qbook.core.mapper.mapperhelper.MapperHelper;
import com.mcp.qbook.core.mapper.mapperhelper.MapperTemplate;
import org.apache.ibatis.mapping.MappedStatement;

/**
 * Created by shiqm on 2017/6/6.
 */
public class MyProvider extends MapperTemplate {

    public MyProvider(){
        System.out.println(mapperClass);
        System.out.println(mapperHelper);
        System.out.println(mapperClass);
        System.out.println("11111111111111111111111111111");
        System.out.println(mapperHelper);    System.out.println(mapperClass);
        System.out.println(mapperHelper);    System.out.println(mapperClass);
        System.out.println(mapperHelper);
    }

    public MyProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        System.out.println(mapperClass);
        System.out.println(mapperHelper);
        System.out.println("================================");
        System.out.println(mapperClass);
        System.out.println(mapperHelper);
    }

    public String selectOne(MappedStatement ms) {
        return "select * from city where id=1";
    }

}
