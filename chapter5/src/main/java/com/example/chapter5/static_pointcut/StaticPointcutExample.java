package com.example.chapter5.static_pointcut;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class StaticPointcutExample {
    public static void main(String[] args) {
        BeanOne beanOne = new BeanOne();
        BeanTwo beanTwo = new BeanTwo();

        BeanOne proxyOne;
        BeanTwo proxyTwo;

        Pointcut pointcut = new SimpleStaticPointcut();
        Advice advice = new SimpleAdvice();
        Advisor advisor = new DefaultPointcutAdvisor(pointcut, advice);

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvisor(advisor);
        proxyFactory.setTarget(beanOne);

        proxyOne = (BeanOne) proxyFactory.getProxy();

        proxyFactory = new ProxyFactory();
        proxyFactory.addAdvisor(advisor);
        proxyFactory.setTarget(beanTwo);

        proxyTwo = (BeanTwo) proxyFactory.getProxy();

        proxyOne.foo();
        proxyTwo.foo();

        proxyOne.bar();
        proxyTwo.bar();

    }
}
