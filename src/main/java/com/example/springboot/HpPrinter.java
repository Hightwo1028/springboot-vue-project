package com.example.springboot;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer {

//    @Value("${count}")
//    private int count;

//    @PostConstruct
//    public void initialize() {
//        count = 5;
//    }

    @Override
    public void print(String message) {
//        count--;
        System.out.println("HP印表機: " + message);
//        System.out.println("剩餘使用次數" + count);
    }
}
