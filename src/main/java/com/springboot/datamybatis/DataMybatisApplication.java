package com.springboot.datamybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.springboot.datamybatis.mapper")
@SpringBootApplication
public class DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataMybatisApplication.class, args);
    }
}
