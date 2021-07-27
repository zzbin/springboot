package com.ahbin.controller;

import com.ahbin.bean.Person;
import com.ahbin.bean.Person1;
import com.ahbin.bean.Person2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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

    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping("hello")
    public String hello(){
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames){
//            System.out.println(name);
//        }
        return "hello world";
    }

}
