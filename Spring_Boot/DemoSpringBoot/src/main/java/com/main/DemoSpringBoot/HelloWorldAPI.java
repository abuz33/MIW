package com.main.DemoSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class HelloWorldAPI {
    public String  helloWorld(){
        return "Hello World";
    }
}
