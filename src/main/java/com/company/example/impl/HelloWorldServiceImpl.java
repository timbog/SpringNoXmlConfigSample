package com.company.example.impl;

import com.company.example.HelloProvider;
import com.company.example.HelloWorldService;
import com.company.example.WorldProvider;

/**
 * Created by Bogdan1 on 02.08.2017.
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    private HelloProvider helloProvider;
    private WorldProvider worldProvider;
    private String format;

    public HelloWorldServiceImpl(HelloProvider helloProvider, WorldProvider worldProvider, String format) {
        this.helloProvider = helloProvider;
        this.worldProvider = worldProvider;
        this.format = format;
    }

    public void sayIt() {
        String hello = helloProvider.getHello();
        String world = worldProvider.getWorld();
        System.out.println(String.format(format, hello, world));
    }

    public HelloProvider getHelloProvider() {
        return helloProvider;
    }

    public void setHelloProvider(HelloProvider helloProvider) {
        this.helloProvider = helloProvider;
    }

    public WorldProvider getWorldProvider() {
        return worldProvider;
    }

    public void setWorldProvider(WorldProvider worldProvider) {
        this.worldProvider = worldProvider;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
