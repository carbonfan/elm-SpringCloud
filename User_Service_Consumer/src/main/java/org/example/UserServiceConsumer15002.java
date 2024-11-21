package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {})
@EnableDiscoveryClient
@EnableFeignClients
public class UserServiceConsumer15002 {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumer15002.class,args);
    }
}