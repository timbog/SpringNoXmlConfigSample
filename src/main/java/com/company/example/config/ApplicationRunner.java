package com.company.example.config;

import com.company.example.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Bogdan1 on 02.08.2017.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorldService service =  (HelloWorldService) context.getBean("helloWorldService");
        service.sayIt();
    }

}
