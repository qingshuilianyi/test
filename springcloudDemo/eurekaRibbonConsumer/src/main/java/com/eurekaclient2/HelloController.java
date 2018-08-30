package com.eurekaclient2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/hi")
    public String sayHi(String name) {

        return "ribbon@" + helloService.sayHi(name);
    }
}
