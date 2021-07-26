package com.ahbin.controller;

import com.ahbin.bean.Person;
import com.ahbin.bean.Person1;
import com.ahbin.bean.Person2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Person person;

    @Autowired
    Person1 person1;

    @Autowired
    Person2 person2;

    @RequestMapping("hello")
    public String hello(){
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        return "hello world";
    }

}
