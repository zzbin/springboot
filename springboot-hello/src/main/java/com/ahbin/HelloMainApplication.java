package com.ahbin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

//@ImportResource()
@SpringBootApplication
public class HelloMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloMainApplication.class, args);
    }

}
