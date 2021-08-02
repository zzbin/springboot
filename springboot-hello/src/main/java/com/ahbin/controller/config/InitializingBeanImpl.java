package com.ahbin.controller.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InitializingBeanImpl implements InitializingBean {

    @Value("${fileUrl}")
    private String fileUrl;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.getProperty("adsl.config");
        System.out.println("2: run with InitializingBean , method -> afterPropertiesSet().");
    }
}
