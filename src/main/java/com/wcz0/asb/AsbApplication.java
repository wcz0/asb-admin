package com.wcz0.asb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author wcz0
 */
@MapperScan("com.wcz0.asb.mapper")
@EnableOpenApi
@SpringBootApplication
public class AsbApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsbApplication.class, args);
    }

}
