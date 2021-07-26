package com.ahbin.bean;

import com.ahbin.factory.YamlPropertySourceFactory;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@ToString
@Component
@PropertySource(value = {"classpath:person2.yml"}, factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "person2")
public class Person2 {
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
