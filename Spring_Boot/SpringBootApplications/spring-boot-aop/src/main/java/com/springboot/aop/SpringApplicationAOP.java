package com.springboot.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringApplicationAOP {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationAOP.class, args);
    }
}
