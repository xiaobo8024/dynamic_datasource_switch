package com.example.config.dds;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 *通过路由变更数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceThreadLocal.getDataSource();
    }
}