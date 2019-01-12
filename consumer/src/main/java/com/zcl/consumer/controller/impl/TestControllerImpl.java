package com.zcl.consumer.controller.impl;

import com.zcl.consumer.controller.TestController;
import com.zcl.producer.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("controller")
public class TestControllerImpl implements TestController {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private ITestService iTestService;

    @Override
    @RequestMapping("sayHi")
    public String sayHello() {
        return iTestService.sayHello(appName);
    }
}
