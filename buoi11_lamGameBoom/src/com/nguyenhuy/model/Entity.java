package com.nguyenhuy.model;

import java.awt.*;

public abstract class Entity {  // class Entity la abstract class bao quát cho Player và BOT
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;

    protected int x;    // toa do x, y
    protected int y;
    protected Image img; // su dung cua java.awt
    protected int orient; // huong di chuyen
    protected int speed = 1;  // nên cố gắng để speed thấp nhất để tăng độ mượt cho game

    public Entity(int x, int y){  // Định sẵn toạ độ của nhân vật khi bắt đầu game
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2d) { // drawImage co width va height thuong dùng để vẽ ảnh background còn drawImage không có thì thường dùng cho các icon game
        g2d.drawImage(img, x, y, null); // truyền ảnh, toạ độ
    }

    public void move() {
        switch (orient){
            case LEFT:
                x -= speed;     // Trường hợp orient = LEFT thì trừ toạ độ x của nhân vật đi để nó dịch sang trái, tương tự 3 TH còn lại
                break;
            case RIGHT:
                x += speed;
                break;
            case UP:
                y -= speed;
                break;
            case DOWN :
                y += speed;
                break;
        }
    }
}
