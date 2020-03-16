package com.epam.spring.annotated;

import com.epam.spring.initial.HelloWorldMessageProvider;
import com.epam.spring.initial.MessageProvider;
import com.epam.spring.initial.MessageRenderer;
import com.epam.spring.initial.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;

public class HelloWorldConfiguration {

    @Bean
    MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
