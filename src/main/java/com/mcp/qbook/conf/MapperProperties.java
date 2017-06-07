package com.mcp.qbook.conf;

import com.mcp.qbook.core.mapper.entity.Config;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shiqm on 2017/6/7.
 */
@ConfigurationProperties(prefix = "mapper")
public class MapperProperties extends Config {

    private List<Class> mappers = new ArrayList<Class>();

    public List<Class> getMappers() {
        return mappers;
    }

    public void setMappers(List<Class> mappers) {
        this.mappers = mappers;
    }

    public String getUuid() {
        return getUUID();
    }

    public void setUuid(String uuid) {
        setUUID(uuid);
    }

    public boolean isBefore() {
        return isBEFORE();
    }

    public void setBefore(boolean before) {
        setBEFORE(before);
    }

    public String getIdentity() {
        return getIDENTITY();
    }

    public void setIdentity(String identity) {
        setIDENTITY(identity);
    }

}
