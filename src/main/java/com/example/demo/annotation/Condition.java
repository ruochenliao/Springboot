package com.example.demo.annotation;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Condition
 * ConditionOnProperties
 * ConditionOnClass
 * ConditionOnBean
 */
@ConditionalOnProperty(name = {"env"}, havingValue = "daily")
@Component
public class Condition {
    @PostConstruct
    public void sucess(){
        System.out.println("condition bean is created");
    }

}
