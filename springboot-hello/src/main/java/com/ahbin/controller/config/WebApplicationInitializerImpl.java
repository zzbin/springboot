package com.ahbin.controller.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class WebApplicationInitializerImpl implements WebApplicationInitializer {
    @Value("${fileUrl}")
    private String fileUrl;

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.getProperty("adsl.config");
        System.out.println("WebApplicationInitializerImpl.onStartup");
    }
}
