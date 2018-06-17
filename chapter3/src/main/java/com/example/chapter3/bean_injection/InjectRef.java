package com.example.chapter3.bean_injection;

import com.example.chapter3.injection.Oracle;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectRef {

    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:xml/app-context-ir.xml");
        ctx.refresh();

        InjectRef injectRef = (InjectRef)ctx.getBean("injectRef");
        System.out.println(injectRef);
    }

    @Override
    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
