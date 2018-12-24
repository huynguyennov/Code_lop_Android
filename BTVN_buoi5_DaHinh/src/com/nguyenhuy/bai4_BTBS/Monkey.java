package com.nguyenhuy.bai4_BTBS;

public class Monkey extends Animal {
    private String fruit;

    public Monkey(String name, float weight, String fruit) {
        super(name, weight);
        this.fruit = fruit;
    }

    @Override
    public void show() {
        System.out.println("Con khi " + this.name + " nang " + this.weight + " kg va thich an " + this.fruit);
    }
}
