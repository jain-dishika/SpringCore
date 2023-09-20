package com.example.demo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Circle implements Drawing{
    public void drawShape(){
        System.out.println("Drawing a Circle");
    }
}
