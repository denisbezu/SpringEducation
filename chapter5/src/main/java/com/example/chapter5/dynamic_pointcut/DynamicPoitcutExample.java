package com.example.chapter5.dynamic_pointcut;

import com.example.chapter5.static_pointcut.SimpleAdvice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class DynamicPoitcutExample {
    public static void main(String[] args) {
        SampleBean target = new SampleBean();
        Advisor advisor  = new DefaultPointcutAdvisor(new SampleDynamicPointcut(), new SimpleAdvice());
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvisor(advisor);
        proxyFactory.setTarget(target);

        SampleBean proxy = (SampleBean) proxyFactory.getProxy();

        proxy.foo(1);
        proxy.foo(10);
        proxy.foo(100);

        proxy.bar();
        proxy.bar();
        proxy.bar();
    }
}
