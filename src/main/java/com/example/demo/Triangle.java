package com.example.demo;
import org.springframework.stereotype.Component;
@Component
public class Triangle implements Drawing{
    public void drawShape(){
        System.out.println("Drawing a Triangle");
    }
}
