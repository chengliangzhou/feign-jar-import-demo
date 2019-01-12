package com.zcl.producer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient("producer")
public interface ITestService {
    @RequestMapping("sayHello")
    String sayHello(String appName);
}
