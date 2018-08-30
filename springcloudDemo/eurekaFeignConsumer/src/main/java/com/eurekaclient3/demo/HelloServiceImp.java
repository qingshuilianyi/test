package com.eurekaclient3.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImp implements HelloService {

    @Override
    public String sayHi(String name) {
        return "default!!!! error  " + name;
    }
}
