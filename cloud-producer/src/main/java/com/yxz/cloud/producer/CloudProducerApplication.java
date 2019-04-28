package com.yxz.cloud.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//声明该微服务注册到服务注册中心 或者 @EnableEurekaClient
@SpringBootApplication
public class CloudProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProducerApplication.class, args);
    }

}
