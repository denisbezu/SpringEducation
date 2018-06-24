package com.example.chapter4.beanName;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNamePrinter implements BeanNameAware {

    private String beanName;


    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void someOperation() {
        System.out.println("Bean [" + beanName + "]  someOperation()");
    }
}
