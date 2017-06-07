package com.mcp.qbook.util;


import com.mcp.qbook.core.mapper.common.Mapper;
import com.mcp.qbook.core.mapper.common.MySqlMapper;

/**
 * Created by shiqm on 2017/6/7.
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
