package com.epam.spring.initial;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMesage() {
        return "Hello World";
    }
}
