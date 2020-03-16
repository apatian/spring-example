package com.epam.spring.factory;

import com.epam.spring.initial.MessageProvider;
import com.epam.spring.initial.MessageRenderer;

public class HelloWorldDecoupledWIthFactory {

    public static void main(String[] args) {
        MessageSupportFactory factory = MessageSupportFactory.getInstance();

        MessageProvider messageProvider = factory.getMessageProvider();
        MessageRenderer messageRenderer = factory.getMessageRenderer();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
