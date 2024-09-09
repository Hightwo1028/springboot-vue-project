package com.example.springboot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* com.example.springboot.HpPrinter.*(..))")
    public void before() {
        System.out.println("I am before");
    }

    @After("execution(* com.example.springboot.HpPrinter.*(..))")
    public void after  (){
        System.out.println("I am after");
    }
}
