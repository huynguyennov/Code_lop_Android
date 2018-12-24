package com.nguyenhuy.model;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Bot extends Entity {
    private Random rd = new Random();
    private Image[] arrImg = {
            new ImageIcon(getClass().getResource("/images/blink_left.png")).getImage(), // get nguồn ảnh, left o vị trí [0] tuong ung orient 2
            new ImageIcon(getClass().getResource("/images/blink_right.png")).getImage(), // right vi tri [1] tuong ung voi orient 1
            new ImageIcon(getClass().getResource("/images/blink_up.png")).getImage(),   // ....
            new ImageIcon(getClass().getResource("/images/blink_down.png")).getImage()  // ....
    };

    public Bot(int x, int y) {
        super(x, y);
        orient = DOWN;
    }

    @Override
    public void draw(Graphics2D g2d) {
        img = arrImg[orient];  // orient dang o vi tri nao thì img sẽ bằng với hình ảnh ở vị trí đó trong mảng arrIMG
        super.draw(g2d);
    }


    private void generateOrient() { // cho orient random từ 0 - 3 để bot random di chuyển
        int percent = rd.nextInt(101);  // tạo percent để bot không đổi hướng liên tục, chỉ 5%
        if(percent > 97){
            orient = rd.nextInt(4);

        }
    }

    @Override
    public void move() {
        generateOrient();  // cho orient random truoc khi move
        super.move();
    }
}
