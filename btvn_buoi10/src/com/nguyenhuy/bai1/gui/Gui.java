package com.nguyenhuy.bai1.gui;

import javax.swing.*;

public class Gui extends JFrame {
    public static final int W = 600;
    public static final int H = 400;
    public Gui() {
        setTitle("Giai phuong trinh bac 2");
        setSize(W, H);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        MyPanel myPanel = new MyPanel();
        add(myPanel);
    }
}
