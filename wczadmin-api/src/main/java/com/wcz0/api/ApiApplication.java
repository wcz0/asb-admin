package com.wcz0.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync
@EnableTransactionManagement
@Configuration
@SpringBootApplication(exclude =  DataSourceAutoConfiguration.class, scanBasePackages = {"com.wcz0", "com.wcz0.api"})
@MapperScan(basePackages = {"com.wcz0.**.dao"})
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}