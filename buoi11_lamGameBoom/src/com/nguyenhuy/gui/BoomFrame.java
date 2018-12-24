package com.nguyenhuy.gui;

import javax.swing.*;

public class BoomFrame extends JFrame {
    public static final int W = 900;
    public static final int H = 600;
    public BoomFrame() {
        setTitle("Boom");
        setSize(W, H);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        BoomPanel boomPanel = new BoomPanel();
        add(boomPanel);
    }
}
