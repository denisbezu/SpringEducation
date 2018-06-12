package com.example.chapter3.setter_di;

import com.example.chapter3.cdl.Dependency;

public class SetterInjection {
    private Dependency dependency;

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
