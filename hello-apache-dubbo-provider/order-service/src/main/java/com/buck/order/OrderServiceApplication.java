package com.buck.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-09-14 11:16
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.buck.order.mapper")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class);
    }
}
