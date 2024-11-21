package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.comm.dao")
public class BusinessServiceProvider16000 {
    public static void main(String[] args) {
        SpringApplication.run(BusinessServiceProvider16000.class,args);
    }
}