package com.example.chapter3;

import com.example.demo.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("app-context-annotation.xml");
        ctx.refresh();
        MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
