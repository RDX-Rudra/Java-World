package com.rdxrudra.hello;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    public String hello(){
        return "Hello, World";
    }
}
