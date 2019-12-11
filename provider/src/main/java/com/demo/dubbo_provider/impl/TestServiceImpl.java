package com.demo.dubbo_provider.impl;


import dubbo_api.service.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello() {
        return "Hello Dubbo!";
    }

    @Override
    public String getName(String name) {
        return name;
    }
}
