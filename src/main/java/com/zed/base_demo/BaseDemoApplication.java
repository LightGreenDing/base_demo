package com.zed.base_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zed.base_demo.dao")
public class BaseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseDemoApplication.class, args);
    }

}
