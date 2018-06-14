package com.example.chapter3.constructor_injection;

import com.example.demo.MessageProvider;
import com.example.demo.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("classpath:xml/constructor-in.xml");
        genericXmlApplicationContext.refresh();

        MessageProvider messageProvider = genericXmlApplicationContext.getBean("messageProvider", MessageProvider.class);

        System.out.println(messageProvider.getMessage());
    }
}
