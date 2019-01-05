package com.nguyenhuy.model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Player extends Entity{

    private Image[] imLeft = { // mang cac anh di phia ben trai
            new ImageIcon(getClass().getResource("/santa_images/left0.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left1.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left2.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left3.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left4.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left5.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left6.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left7.png")).getImage(),
    };

    private Image[] imRight = {
            new ImageIcon(getClass().getResource("/santa_images/right0.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right1.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right2.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right3.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right4.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right5.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right6.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right7.png")).getImage(),
    };

    private Image[] imUp = {
            new ImageIcon(getClass().getResource("/santa_images/up0.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up1.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up2.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up3.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up4.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up5.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up6.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up7.png")).getImage(),
    };

    private Image[] imDown = {
            new ImageIcon(getClass().getResource("/santa_images/down0.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down1.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down2.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down3.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down4.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down5.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down6.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down7.png")).getImage(),
    };

    private Image[][] images = {imLeft, imRight, imUp, imDown}; // mảng images chứa các phần tử mảng => mảng 2 chiều
    private int index = 0;  // vị trí ảnh
    private int count = 0; // đếm số lần move()
    private long t;

    // ****** kết thúc phần biến

    public Player(int x, int y) {
        super(x, y);
        orient = RIGHT;     // cho hàm khởi tạo khởi tạo biến thực thể orient  = RIGHT
    }

    @Override
    public void draw(Graphics2D g2d) {
        img = images[orient][index];    // mảng 2 chiều: hướng di chuyển, vị trí index của ảnh
        super.draw(g2d);
    }

    public void changeOrient (int newOrient) { // phương thức để gán hướng mới cho player khi cần
        orient = newOrient;
    }

    @Override   // cài đặt để đổi ảnh trong mảng khi di chuyển
    public void move() {
        count ++;
        if (count == 5){        // move 5 lần mới tăng index (ảnh khác ) 1 lần
            index++;       // mỗi lần cập nhật di chuyển, index tăng 1
            if (index >= images[orient].length){
                index = 0;
            }
            count = 0;  // reset lại count từ 5 về 0
        }
        super.move();
    }

    // Phương thức xử lý đặt Boom
    public void fire(ArrayList<Boom> arrBoom) {
        // Cài đặt để giới hạn thời gian đặt bom liên tiếp
        long T = System.currentTimeMillis();    // Trả về thời gian hiện tại
        if(T - t < 1000){    //  tính theo mili giây
            return;
        }
        t = T;
        // vì toạ độ của player là ở góc trên bên phải nên 2 phép tính dưới sẽ lấy toạ độ ở giữa player
        int xBoom = x + images[orient][index].getWidth(null) / 2;   // Lấy toạ độ của Boom so với Player
        int yBoom = y + images[orient][index].getHeight(null) / 2;
        Boom boom = new Boom(xBoom, yBoom);
        arrBoom.add(boom);
    }
}
