package com.bee.trans.provider.config.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/** 
 * @Description 动态数据源
 * @author ouyangxiang
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    public Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }

}
