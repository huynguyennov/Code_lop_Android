package com.nguyenhuy.bai5_btbs;

public class Tank {
    protected Bullet bullet;
    protected float speed;

    public Tank(Bullet bullet, float speed) {
        this.bullet = bullet;
        this.speed = speed;
    }

    public void show(){
        System.out.println(bullet.toString());
        System.out.println("Toc do: " + this.speed);
    }

    public void move(){
        System.out.println("Xe tang di chuyen");
    }

    public void fire(){
        System.out.println("Xe tang khai hoa");
    }

    public void check(){
        System.out.println("Kiem tra xe trung dan");
    }

}
