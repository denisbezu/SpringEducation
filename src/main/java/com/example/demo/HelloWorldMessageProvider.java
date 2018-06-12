package com.example.demo;

import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
