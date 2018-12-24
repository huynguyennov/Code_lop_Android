package com.nguyenhuy.ui;

import javax.swing.*;

public class MyFrame extends JFrame {
    public static final int W = 300;
    public static final int H = 400;
    public MyFrame() {
        setSize(W, H);
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("Buoi 10");
        MyPanel myPanel = new MyPanel();
        add(myPanel);
    }
}
