package com.epam.spring.factory;

import com.epam.spring.initial.MessageProvider;
import com.epam.spring.initial.MessageRenderer;

import java.util.Properties;

public class MessageSupportFactory {

    private static MessageSupportFactory instance;

    static {
        instance = new MessageSupportFactory();
    }

    private MessageProvider messageProvider;
    private MessageRenderer messageRenderer;
    private Properties props;

    public MessageSupportFactory() {
        this.props = new Properties();

        try {
            props.load(this.getClass().getResourceAsStream("/msf.properties"));

            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            messageRenderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            messageProvider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return messageRenderer;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
