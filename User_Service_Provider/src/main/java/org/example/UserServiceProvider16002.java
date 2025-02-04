package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.comm.dao")
public class UserServiceProvider16002 {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceProvider16002.class,args);
    }
}