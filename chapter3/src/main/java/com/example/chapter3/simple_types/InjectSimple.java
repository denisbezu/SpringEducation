package com.example.chapter3.simple_types;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {
    private String name;

    private int age;

    private float height;

    private boolean programmer;

    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext  ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:xml/app-context-st.xml");
        ctx.refresh();
        InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
        System.out.println(simple);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "InjectSimple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }
}
