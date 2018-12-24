package com.nguyenhuy.bai5_btbs;

public class Main {
    public static void main(String[] args) {
        Dan12mm dan12mm = new Dan12mm(1.5F, 2998.8F);
        Dan120mm dan120mm = new Dan120mm(8.5F, 1500F);
        AllyTank allyTank = new AllyTank(dan120mm, 52, 3);
        allyTank.show();
        allyTank.move();
        allyTank.fire();
        dan120mm.fly();
        dan120mm.boom();
        allyTank.check();
        allyTank.save();
        System.out.println("========");
        EnemyTank enemyTank = new EnemyTank(dan12mm, 42.5F, "Xe boc thep");
        enemyTank.show();
        enemyTank.move();
        enemyTank.fire();
        dan12mm.fly();
        dan12mm.boom();
        enemyTank.check();
        enemyTank.destroy();
    }
}
