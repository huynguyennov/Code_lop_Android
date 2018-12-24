package com.nguyenhuy.ui;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        setLayout(null); // set layout cho các đối tượng con mà nó chứa, doi tuong nao add truoc sẽ nằm trước
        setBackground(Color.BLACK);
        initComp();
    }

    private void initComp() {
        PanelGame panelGame = new PanelGame();
        add(panelGame);
        PanelMenu panelMenu = new PanelMenu();
        add(panelMenu);
    }
}
