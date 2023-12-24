package com.example.demo.controller;

import com.example.demo.Example;
import com.example.demo.Example2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class MyConfiguration {
    public MyConfiguration() {
        System.out.println("My Configuration");
    }
    @Bean
    public Example getExample(){
        return new Example();
    }
    @Bean
    public Example2 getExample2() {
        return new Example2();
    }
}
