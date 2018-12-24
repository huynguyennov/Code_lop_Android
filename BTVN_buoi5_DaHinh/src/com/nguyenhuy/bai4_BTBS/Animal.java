package com.nguyenhuy.bai4_BTBS;

public abstract class Animal {
    protected String name;
    protected float weight;

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void show();
}
