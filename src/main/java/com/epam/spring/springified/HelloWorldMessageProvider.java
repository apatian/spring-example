package com.epam.spring.springified;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMesage() {
        return "Hello World";
    }
}
