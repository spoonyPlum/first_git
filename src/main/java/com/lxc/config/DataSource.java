package com.lxc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSource {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource getDataSource(){
        return new DruidDataSource();
    }
}
