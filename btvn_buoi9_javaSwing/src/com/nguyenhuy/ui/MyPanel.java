package com.nguyenhuy.ui;

import com.nguyenhuy.ui.inside_mypanel.inside_paneld.PanelD1;
import com.nguyenhuy.ui.inside_mypanel.inside_paneld.PanelD2;
import com.nguyenhuy.ui.inside_mypanel.inside_paneld.PanelD3;
import com.nguyenhuy.ui.inside_mypanel.inside_panelu.PanelU1;
import com.nguyenhuy.ui.inside_mypanel.inside_panelu.PanelU2;
import com.nguyenhuy.ui.inside_mypanel.inside_panelu.PanelU3;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        setLayout(null);
        setBackground(Color.WHITE);
        initComp();
    }

    private void initComp(){
        PanelU1 panelU1 = new PanelU1();
        add(panelU1);
        PanelU2 panelU2 = new PanelU2();
        add(panelU2);
        PanelU3 panelU3 = new PanelU3();
        add(panelU3);
        PanelD1 panelD1 = new PanelD1();
        add(panelD1);
        PanelD2 panelD2 = new PanelD2();
        add(panelD2);
        PanelD3 panelD3 = new PanelD3();
        add(panelD3);
    }
}
