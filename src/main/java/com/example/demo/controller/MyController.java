package com.example.demo.controller;

import com.example.demo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    private MyConfiguration myConfiguration;
    public MyController(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }
//    private Example example;
//    public MyController(Example example) {
//        this.example = example;
//    }

    //Lazy Anotasyonu Yöntem 1
//    private MyComponent myComponent;
//    public MyController(MyComponent myComponent) {
//        this.myComponent = myComponent;
//    }
//    //Field Injection Yöntemi
//    private FirstClass firstClass;
//    private SecondClass secondClass;
//    private ThirdClass thirdClass;
//    @GetMapping(path = "/getname")
//    public String getNameOfClass() {
//        return this.firstClass.getName() + " - " + this.secondClass.getName() + " - " + this.thirdClass.getName();
//    }
//
//    //Setter Injection Yöntemi
//    @Autowired
//    public void setSecondClass(SecondClass secondClass) {
//        this.secondClass = secondClass;
//    }
//
//    //Constructor Injection Yöntemi
//    @Autowired
//    public MyController (ThirdClass thirdClass, @Qualifier("firstClass") FirstClass firstClass) {
//        this.thirdClass = thirdClass;
//        this.firstClass = firstClass;
//    }


}
