package com.nguyenhuy.ui;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends JFrame implements WindowListener {
    public static final int W = 800;
    public static final int H = 600;

    public MyFrame() {
        setTitle("Buoi 8"); // hien len tren khung treo
        setSize(W, H);
        // setLocation(200, 200); // cài đặt vị trí của góc khung hình, tim hieu ve toa do tren khung hinh
        setLocationRelativeTo(null); // cai dat khung hinh giữa cái gì đó, ở đây giữa màn hình nên để null
        setResizable(false);    // cho phép kéo thả kích thước không
        // set đóng chương trình: có 4 giá trị truyền vào
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // đóng hoàn toàn chương trình, nhưng là khi đóng chương trình cuối cùng
        setDefaultCloseOperation(EXIT_ON_CLOSE); // đóng hoàn toàn chương trình ngay khi đóng chương trình đầu tiên
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // khong lam gi ca
        addWindowListener(this); // cho MyFrame lắng nghe WindowListener

        MyPanel panel = new MyPanel();
        add(panel); // đưa khung panel vào trong khung Frame
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Ban co muon thoat hay khong?",
                "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                // lựa chọn có không     // hiển thị icon kiểu câu hỏi
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {  // deactivated là lúc ẩn

    }
}
