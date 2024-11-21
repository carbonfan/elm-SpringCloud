package org.example;

import com.alibaba.spring.beans.factory.annotation.EnableConfigurationBeanBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayService12000 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayService12000.class,args);
    }
}