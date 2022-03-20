package com.example.demo.annotation;//package annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 *
 */
@Component
public class PostProcessor {

    static {
        System.out.println("static init");
    }

    public void process(){
        System.out.println("processing");
    }

    @PostConstruct
    public void post(){
        System.out.println("after init");
    }
}
