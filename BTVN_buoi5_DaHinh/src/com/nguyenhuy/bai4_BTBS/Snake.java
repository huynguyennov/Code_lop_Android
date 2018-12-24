package com.nguyenhuy.bai4_BTBS;

public class Snake extends Animal {
    private float length;

    public Snake(String name, float weight, float length) {
        super(name, weight);
        this.length = length;
    }

    @Override
    public void show() {
        System.out.println("Con ran " + this.name + " nang " + this.weight + " kg va dai " + this.length + " met");
    }
}
