package com.lxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lxc.mapper")
@ComponentScan(basePackages = "com.lxc")
public class WaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterApplication.class, args);
    }
}
