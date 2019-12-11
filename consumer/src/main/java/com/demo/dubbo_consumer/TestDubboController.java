package com.demo.dubbo_consumer;

import dubbo_api.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDubboController {
    @Reference(version = "1.0.0")
    private TestService service;

    @GetMapping("sayHello")
    public String sayHello() {
        return service.sayHello();
    }
    @GetMapping("getName")
    public String getName(@RequestParam("name") String name) {
        return service.getName(name);
    }
}
