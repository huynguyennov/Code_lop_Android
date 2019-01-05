package com.nguyenhuy.gui;

import javax.swing.*;

public class BoomFrame extends JFrame {
    public static final int W = 682;
    public static final int H = 625;
    public BoomFrame() {
        setTitle("Boom");
        setSize(W, H);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        BoomPanel boomPanel = new BoomPanel();
        add(boomPanel);
    }
}
