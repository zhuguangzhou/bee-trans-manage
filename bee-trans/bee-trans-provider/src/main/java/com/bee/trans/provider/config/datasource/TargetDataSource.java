package com.bee.trans.provider.config.datasource;

import java.lang.annotation.*;

/** 
 * @Description 在方法上使用，用于指定使用哪个数据源
 * @author ouyangxiang
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    /** 数据源名称 */
    DataSourceEnum value();
}
