package com.company.example.config;

import com.company.example.HelloProvider;
import com.company.example.HelloWorldService;
import com.company.example.WorldProvider;
import com.company.example.impl.HelloProviderImpl;
import com.company.example.impl.HelloWorldServiceImpl;
import com.company.example.impl.WorldProviderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Bogdan1 on 02.08.2017.
 */
@Configuration
public class AppConfig {

    @Bean
    public HelloProvider helloProvider() {
        return new HelloProviderImpl("hello");
    }

    @Bean
    public WorldProvider worldProvider() {
        return new WorldProviderImpl("world");
    }

    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldServiceImpl(helloProvider(), worldProvider(), "%s %s");
    }

}
