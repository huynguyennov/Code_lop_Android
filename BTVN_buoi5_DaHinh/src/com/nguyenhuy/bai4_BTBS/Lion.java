package com.nguyenhuy.bai4_BTBS;

public class Lion extends Animal {
    private float eat;

    public Lion(String name, float weight, float eat) {
        super(name, weight);
        this.eat = eat;
    }

    @Override
    public void show() {
        System.out.println("Su tu " + this.name + " nang " + this.weight + " kg va an " + this.eat + " kg thit moi ngay");
    }
}
