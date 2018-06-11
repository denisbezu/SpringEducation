package com.example.demo;

public interface MessageRenderer {
    void render();
    void setMessageProvider (MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
