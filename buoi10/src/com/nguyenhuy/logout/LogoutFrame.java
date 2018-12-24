package com.nguyenhuy.logout;

import com.nguyenhuy.ui.MyFrame;

import javax.swing.*;

public class LogoutFrame extends JFrame {
    public LogoutFrame() {
        setSize(MyFrame.W, MyFrame.H);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(false);
        setTitle("Logout");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        LogoutPanel logoutPanel = new LogoutPanel();
        add(logoutPanel);
    }
}
