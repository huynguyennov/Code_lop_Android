package com.nguyenhuy.bai2.gui;

import javax.swing.*;

public class Gui extends JFrame {
    public static final int W = 450;
    public static final int H = 200;
    public Gui() {
        setTitle("PRIME Tool");
        setSize(W, H);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        MyPanel myPanel = new MyPanel();
        add(myPanel);
    }
}
