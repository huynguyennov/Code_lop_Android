package com.nguyenhuy.bai5_btbs;

public class AllyTank extends Tank {
    private int life;

    public AllyTank(Bullet bullet, float speed, int life) {
        super(bullet, speed);
        this.life = life;
    }

    @Override
    public void show() {
        System.out.println("|||Xe tang dong minh|||");
        super.show();
        System.out.println("So mang: " + this.life);
    }

    public void save(){
        System.out.println("Bao ve bot!");
    }
}
