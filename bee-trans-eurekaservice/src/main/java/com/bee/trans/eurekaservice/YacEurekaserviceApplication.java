package com.bee.trans.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启动eureka 注册中心 service
public class YacEurekaserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YacEurekaserviceApplication.class, args);
    }

}
