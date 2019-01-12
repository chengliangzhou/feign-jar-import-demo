package com.zcl.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 注意：直接使用引入的jar包中的feign客户端需要配置扫描外部jar包路径，
 * 否则会因为spring启动类默认扫描不到，报bean找不到错误
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zcl.producer"})
public class ConsumerStarter {
    public static void main(String [] args){
        SpringApplication.run(ConsumerStarter.class, args);
    }
}
