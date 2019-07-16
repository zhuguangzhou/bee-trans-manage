package com.bee.trans.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


@ServletComponentScan
@EnableDiscoveryClient
@EnableFeignClients({"com.yac.cp.feign.*"})
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableHystrix //熔断处理
@SpringBootApplication(scanBasePackages = "com.yac.*")
public class YacCpWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(YacCpWebApplication.class, args);
    }

}
