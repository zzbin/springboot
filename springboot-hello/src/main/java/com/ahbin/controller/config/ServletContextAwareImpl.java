package com.ahbin.controller.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

@Component
public class ServletContextAwareImpl implements ServletContextAware {

    @Value("${fileUrl}")
    private String fileUrl;

    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println("4: run with ServletContextAware , method -> setServletContext().");
    }

}
