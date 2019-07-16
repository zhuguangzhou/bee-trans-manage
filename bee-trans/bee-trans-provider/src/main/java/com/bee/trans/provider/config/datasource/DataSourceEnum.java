package com.bee.trans.provider.config.datasource;

/** 
 * @Description 数据源枚举常量类
 * @author ouyangxiang
 */
public enum DataSourceEnum {
    Mysql("mysql"),
    SQLServer("sqlserver");
    private String name;

    DataSourceEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
