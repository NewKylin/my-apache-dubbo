package com.buck.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-09-14 11:48
 **/

@SpringBootApplication
@MapperScan("com.buck.product.mapper")
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class);
    }
}
