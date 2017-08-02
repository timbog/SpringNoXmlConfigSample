package com.company.example.impl;

import com.company.example.HelloProvider;

/**
 * Created by Bogdan1 on 02.08.2017.
 */
public class HelloProviderImpl implements HelloProvider {

    private String hello;

    public HelloProviderImpl(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

}
