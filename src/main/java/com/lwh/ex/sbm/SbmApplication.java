package com.lwh.ex.sbm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.lwh.ex.sbm.mapper")
@ComponentScan(basePackages = {"com"})
public class SbmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmApplication.class, args);
    }

}
