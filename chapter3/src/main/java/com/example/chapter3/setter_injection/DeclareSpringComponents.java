package com.example.chapter3.setter_injection;

import com.example.demo.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("classpath:xml/setter-in.xml");
        genericXmlApplicationContext.refresh();

        MessageRenderer messageRenderer = genericXmlApplicationContext.getBean("messageRenderer", MessageRenderer.class);

        messageRenderer.render();
    }
}
