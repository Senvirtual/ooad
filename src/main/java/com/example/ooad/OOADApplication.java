package com.example.ooad;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.example.ooad.controller", "com.example.ooad.service",
    "com.example.ooad.domain","com.example.ooad.po"})
@MapperScan("com.example.ooad.dao")
public class OOADApplication {

    public static void main(String[] args) {
        SpringApplication.run(OOADApplication.class, args);
    }
}
