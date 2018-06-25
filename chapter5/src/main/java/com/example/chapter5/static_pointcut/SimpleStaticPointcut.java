package com.example.chapter5.static_pointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return ("foo".equals(method.getName()));
    }

    @Override
    public ClassFilter getClassFilter() {
        return aClass -> (aClass == BeanOne.class);
    }
}
