package com.nguyenhuy.logout;

import com.nguyenhuy.login.MyFrame1;
import com.nguyenhuy.login.MyPanel1;
import com.nguyenhuy.ui.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogoutPanel extends JPanel implements ActionListener {
    private JLabel lbTitle;
    private JButton btnLogout;

    public LogoutPanel() {
        setLayout(null);
        setBackground(Color.WHITE);

        initComps();
    }

    private void initComps() {
        lbTitle = new JLabel();
        lbTitle.setText("Xin chao, " + MyPanel1.account);
        lbTitle.setSize(MyFrame.W, 50);
        lbTitle.setLocation(0, 20);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setForeground(Color.RED);
        lbTitle.setFont(new Font("Apple Chancery", Font.BOLD, 20));
        add(lbTitle);
        //==============
        btnLogout = new JButton();
        btnLogout.setText("Logout");
        btnLogout.setSize(MyFrame.W - 30, 30);
        int y = lbTitle.getY() + lbTitle.getHeight() + 20;
        int x = (MyFrame.W - btnLogout.getWidth()) / 2;
        btnLogout.setLocation(x, y);
        btnLogout.setBackground(Color.RED);
        btnLogout.setForeground(Color.ORANGE);
        add(btnLogout);
        btnLogout.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnLogout)){
            MyFrame1 myFrame1 = new MyFrame1();
            myFrame1.setVisible(true);
        }
    }
}
