package com.nguyenhuy.gui;

import com.nguyenhuy.manager.GameManager;

import javax.swing.*;
import java.awt.*;

public class BoomPanel extends JPanel implements Runnable { // Runable dinh nghĩa công việc mà Thread cần phải làm
    private GameManager gameManager = new GameManager();

    public BoomPanel() {
        setBackground(Color.WHITE);
        gameManager.initGame();     // bat dau vao game thi goi initGame
        Thread thread = new Thread(this);  // khoi tao Thread khi khoi tao Panel, khoi tao 1 lan duy nhat
                                                  // truyen Runable vao Thread
        thread.start(); // chỉ được start 1 lần trên 1 Thread
    }


    @Override // override lai phuong thuc, để vẽ đồ hoạ
    protected void paintComponent(Graphics g) { // Graphics g la but ve
        Graphics2D g2d = (Graphics2D) g;        // ep kieu sang Graphics2D
        super.paintComponent(g2d);              // gọi lại phương thức painComponent của class cha nhưng đổi sang kiểu tham số g2d
        gameManager.draw(g2d);                  // cho game Manager ve
        /*g2d.setColor(Color.RED);        // thay đổi màu bút vẽ
        g2d.setStroke(new BasicStroke(20)); // thay đổi kích thước nét vẽ
        g2d.drawLine(0,0,200,200); // set 2 điểm nối nhau: điểm A(x1, y1) - B(x2, y2)
        g2d.drawOval(200, 200, 100, 50);  // điêm A(x1, y1) điểm bắt đầu kẻ width 100 và height 50
        g2d.drawRect(300,300, 100, 100); // tương tự với oval
        g2d.setFont(new Font(null, Font.ITALIC, 20)); // set font cho chu khi viet tren mat phang
        g2d.drawString("Hello World", 400, 200); // vẽ chữ theo toạ độ A(400, 200)*/

    }


    @Override
    public void run() {  // định nghĩa công việc mà Thread sẽ phải làm
        while (true) {      // đây là vòng lặp vô hạn, nếu trong Main Thread thì sẽ xảy ra lỗi nhưng với Thread chuyên thường
                            // thực hiện các công việc song song và mất nhiều thời gian nên chương trình chạy bình
            gameManager.AI();  // cho Bot chạy liên tục
            // cho Thread chạy chậm lại nếu không các Bot sẽ di chuyển nhiều lần trong thời gian ngắn dẫn đến tốc độ cao ra ngoài màn hình
            repaint();  // cập nhật lại giao diện, vẽ lại
            try {
                Thread.sleep(25);  // chỉnh tốc độ bằng cách tăng giảm độ dài sleep để game mượt
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
