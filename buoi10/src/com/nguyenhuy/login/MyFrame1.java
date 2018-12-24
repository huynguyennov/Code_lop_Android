package com.nguyenhuy.login;

import com.nguyenhuy.ui.MyFrame;

import javax.swing.*;

public class MyFrame1 extends JFrame {
    public MyFrame1() {
        setSize(MyFrame.W, MyFrame.H);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Login");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        MyPanel1 myPanel1 = new MyPanel1();
        add(myPanel1);
    }
}
