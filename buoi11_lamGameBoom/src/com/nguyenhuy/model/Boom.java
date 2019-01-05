package com.nguyenhuy.model;

import javax.swing.*;
import java.awt.*;

public class Boom {
    private int x;  // vị trí boom phải đúng với vị trí đặt boom của nhân vật
    private int y;
    private Image[] images = {  // mảng 5 ảnh cho boom
            new ImageIcon(getClass().getResource("/images/boom1.gif")).getImage(),
            new ImageIcon(getClass().getResource("/images/no1.png")).getImage(),
            new ImageIcon(getClass().getResource("/images/no2.png")).getImage(),
            new ImageIcon(getClass().getResource("/images/no3.png")).getImage(),
            new ImageIcon(getClass().getResource("/images/no4.png")).getImage(),
    };

    private int time = 275; // thời gian boom từ lúc đặt đến lúc nổ xong, thời gian thực = time * thread.sleep (thời gian thread ngủ)
    // đối tượng nào không còn tác dụng trên màn chơi thì phải xoá đối tượng đi
    private int index;      // Giá trị chạy thứ tự trong mảng ảnh

    // **********
    public Boom(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean draw(Graphics2D g2d) {   // nếu trong game bắn đạn, xoá đạn trong phương thức move()
        time --;
        if(time < 0) {      // nếu hết thời gian tồn tại, trả về true để xoá đối tượng sau
            return true;
        }else if(time < 25) {   // nếu thời gian tồn tại còn lại < 80 thì chuyển ảnh trong mảng có index là 4
            index = 4;
        }else if(time < 65) {   // tương tự...
            index = 3;
        }else if(time < 95) {
            index = 2;
        }else if(time < 120) {
            index = 1;
        }else {                 // Thời gian trên 80, cho ảnh lúc mới đặt, vị trí 0
            index = 0;
        }

        // Xử lý đặt boom bị lệch
        int xD = x - images[index].getWidth(null) / 2;
        int yD = y - images[index].getHeight(null) / 2;
        g2d.drawImage(images[index], xD, yD, null);   // vẽ boom, toạ độ vẽ cũng phải bằng toạ độ trung tâm của ảnh boom
        return false;
    }
}
