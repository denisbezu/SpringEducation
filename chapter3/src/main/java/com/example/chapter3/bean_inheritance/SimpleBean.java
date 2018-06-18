package com.example.chapter3.bean_inheritance;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SimpleBean {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:xml/app-context-binh.xml");
        ctx.refresh();

        SimpleBean parent = (SimpleBean) ctx.getBean("inheritParent");
        SimpleBean child = (SimpleBean) ctx.getBean("inheritChild");

        System.out.println("Parent " + parent);
        System.out.println("Child " + child);
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
