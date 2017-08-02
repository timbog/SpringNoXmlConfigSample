package com.company.example.impl;

import com.company.example.WorldProvider;

/**
 * Created by Bogdan1 on 02.08.2017.
 */
public class WorldProviderImpl implements WorldProvider {

    private String world;

    public WorldProviderImpl(String world) {
        this.world = world;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

}
