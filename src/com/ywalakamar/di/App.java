package com.ywalakamar.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle tri = (Triangle) context.getBean("triangle");
        tri.draw();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
