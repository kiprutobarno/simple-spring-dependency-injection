package com.ywalakamar.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Shape circle = (Shape) context.getBean("circle");
        circle.draw();
        context.close();
    }
}
