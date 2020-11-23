package com.example.druiddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.druiddemo.mapper")
public class DruiddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruiddemoApplication.class, args);
    }

}
