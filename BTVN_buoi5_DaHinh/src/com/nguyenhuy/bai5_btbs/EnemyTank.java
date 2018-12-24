package com.nguyenhuy.bai5_btbs;

public class EnemyTank extends Tank {
    private String type;

    public EnemyTank(Bullet bullet, float speed, String type) {
        super(bullet, speed);
        this.type = type;
    }

    @Override
    public void show() {
        System.out.println("|||Xe tang dich|||");
        super.show();
        System.out.println("Loai xe tang: " + this.type);
    }

    public void destroy(){
        System.out.println("Pha huy bot!");
    }
}
