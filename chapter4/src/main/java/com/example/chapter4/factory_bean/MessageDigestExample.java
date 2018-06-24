package com.example.chapter4.factory_bean;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("classpath:xml/app-context-df.xml");
        genericXmlApplicationContext.refresh();

        MessageDigester digester = (MessageDigester) genericXmlApplicationContext.getBean("digester");
        digester.digest("Hello world!");
    }
}
