package com.bee.trans.provider;

import com.bee.trans.provider.config.datasource.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Import({DynamicDataSourceRegister.class})
@EnableTransactionManagement // 开启事务
@ServletComponentScan // 开启自动注解
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class YacCpProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YacCpProviderApplication.class, args);
    }

}
