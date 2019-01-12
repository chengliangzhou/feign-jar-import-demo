package com.zcl.producer.service.impl;

import com.zcl.producer.service.ITestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("testService")
public class TestServiceImpl implements ITestService {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("sayHello")
    @Override
    public String sayHello(String appName) {
        return "---hello," + appName;
    }
}
