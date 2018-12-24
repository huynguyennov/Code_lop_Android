package com.nguyenhuy.bai5_btbs;

public abstract class Bullet {
    private float damage;
    private float speed;

    public Bullet(float damage, float speed) {
        this.damage = damage;
        this.speed = speed;
    }

    public void fly(){
        System.out.println("Dan bay den muc tieu!");
    }

    public void boom(){
        System.out.println("Dan no!");
    }

    @Override
    public String toString() {
        return "Dan{" +
                "sat thuong=" + damage +
                ", toc do=" + speed +
                '}';
    }
}
