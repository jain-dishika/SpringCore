package com.example.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.example.demo")
public class DemoApplication {
	public static void main(String[] args){
		System.out.println("Mai to chaleyaaa!!");
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoApplication.class);
		Shapes obj = (Shapes) context.getBean("shapes");
		obj.dr.drawShape();
	}
}
