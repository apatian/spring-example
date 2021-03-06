package com.epam.spring.springified;

public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class " +
                    StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMesage());
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
