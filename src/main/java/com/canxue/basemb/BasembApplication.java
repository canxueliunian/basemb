package com.canxue.basemb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.canxue.basemb.mapper")
public class BasembApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasembApplication.class, args);
    }
}
