package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {})
@EnableDiscoveryClient
@EnableFeignClients
public class OrdersServiceConsumer15001 {
    public static void main(String[] args) {
        SpringApplication.run(OrdersServiceConsumer15001.class,args);
    }
}