package com.example.chapter4.Java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSimpleExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(AppConfig.class);

        MessageRenderer renderer =
                ctx.getBean("messageRenderer", MessageRenderer.class);

        renderer.render();
    }
}