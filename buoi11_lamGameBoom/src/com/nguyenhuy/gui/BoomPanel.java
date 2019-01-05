package com.nguyenhuy.gui;

import com.nguyenhuy.manager.GameManager;
import com.nguyenhuy.model.Entity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BoomPanel extends JPanel implements Runnable, KeyListener { // Runable dinh nghĩa công việc mà Thread cần phải làm
    private GameManager gameManager = new GameManager();
    private boolean[] flag = new boolean[256]; // 256 chiếc cờ đóng mở cho 256 phím
    public BoomPanel() {
        setBackground(Color.WHITE);
        gameManager.initGame();     // bat dau vao game thi goi initGame
        Thread thread = new Thread(this);  // khoi tao Thread khi khoi tao Panel, khoi tao 1 lan duy nhat
                                                  // truyen Runable vao Thread
        thread.start(); // chỉ được start 1 lần trên 1 Thread

        setFocusable(true);     // phải gọi phương thức này trước khi add keyListener
        addKeyListener(this);
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
            // vứt code nhận diện phím vào đây để có thể đa luồng nhận nhiều phím
            // muốn nhân vật đi được chéo thì bỏ else
            if (flag[KeyEvent.VK_LEFT]){    // Di chuyển trái khi ấn phím left
                gameManager.movePlayer(Entity.LEFT);
            } else if (flag[KeyEvent.VK_RIGHT]){
                gameManager.movePlayer(Entity.RIGHT);
            }else if (flag[KeyEvent.VK_UP]){
                gameManager.movePlayer(Entity.UP);
            }else if (flag[KeyEvent.VK_DOWN]){
                gameManager.movePlayer(Entity.DOWN);
            }
            if(flag[KeyEvent.VK_SPACE]){    // Xử lý đặt boom khi ấn phím cách
                gameManager.playerFire();
            }
            repaint();  // cập nhật lại giao diện, vẽ lại
            try {
                Thread.sleep(10);  // chỉnh tốc độ bằng cách tăng giảm độ dài sleep để game mượt
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    // 3 phương thức của KeyListener
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override   // xử lý cho sự kiện nhấn phím xuống
    // để xử lý được nhiều phím, ta gán cho các lần nhấn là mở và đóng. Khi ấn xuống sẽ được mở, chỉ khi nhả phím ra mới là đóng
    // nhấn phím khác cũng ko đóng phím trước đó
    public void keyPressed(KeyEvent e) {    // trạng thái khi ấn phím xuống - thời gian giữ phím
/*        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            gameManager.movePlayer(Entity.LEFT);
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            gameManager.movePlayer(Entity.RIGHT);
        }else if(e.getKeyCode() == KeyEvent.VK_UP) {
            gameManager.movePlayer(Entity.UP);
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            gameManager.movePlayer(Entity.DOWN);    // cach nay khong chuan
        }*/
        flag[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {   // trạng thái khi nhả phím ra
        flag[e.getKeyCode()] = false;
    }
}
