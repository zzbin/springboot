package com.ahbin.controller.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Component
public class ServletContextListenerImpl implements ServletContextListener {

    @Value("${fileUrl}")
    private String fileUrl;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("1: run with ServletContextListener , method -> contextInitialized().");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContextListenerImpl.contextDestroyed");
    }

}
