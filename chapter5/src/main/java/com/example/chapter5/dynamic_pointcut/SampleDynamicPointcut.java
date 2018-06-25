package com.example.chapter5.dynamic_pointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SampleDynamicPointcut extends DynamicMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> aClass) {
        System.out.println("Static check for " + method.getName());
        return ("foo".equals(method.getName()));
    }

    @Override
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        System.out.println("Dynamic check for " + method.getName());
        int x = ((Integer) objects[0]).intValue();
        return (x != 100);
    }

    @Override
    public ClassFilter getClassFilter() {
        return aClass -> aClass == SampleBean.class;
    }
}
