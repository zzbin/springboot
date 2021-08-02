package com.ahbin.controller.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostConstructDemo {

    @Value("${fileUrl}")
    private String fileUrl;

    @PostConstruct
    public void run() {
        System.out.println("3: run with PostConstruct , method -> run().");
    }

}
