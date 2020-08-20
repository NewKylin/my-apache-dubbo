package com.buck.apache.dubbo.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-07-14 17:33
 **/
@SpringBootApplication
@MapperScan("com.buck.apache.dubbo.provider.mapper")
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
