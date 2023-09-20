package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class Square implements Drawing{
    public void drawShape(){
        System.out.println("Drawing a Square");
    }
}
