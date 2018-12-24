package com.nguyenhuy.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbTitle;     // nhãn
    private JTextField tfInput; // vùng ký tự
    private JButton btnSubmit;
    private JButton btnCancel;
    public MyPanel() {
        setLayout(null);
        setBackground(Color.WHITE);
        initComps();
    }

    private void initComps() {
        lbTitle = new JLabel();
        lbTitle.setText("Hellojbjyvjjkbi");
        lbTitle.setSize(MyFrame.W, 100);
        lbTitle.setLocation(0, 10);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER); // cho text trong label ra giua man, left - center- right
        lbTitle.setForeground(Color.RED); // set mau cua chu
        lbTitle.setFont(new Font("Apple Chancery", Font.BOLD, 20));
                                  // ten phong           // kieu phong - kich co
        add(lbTitle);
        //================
        tfInput = new JTextField();
        // tính y theo kích thước của component trên + toạ độ y + khoảng cách
        int y = lbTitle.getHeight() + lbTitle.getY() + 20;
        tfInput.setSize(MyFrame.W - 30, 50);
        tfInput.setLocation(10, y);
        add(tfInput);
        //================
        btnSubmit = new JButton();
        btnSubmit.setText("OK");
        btnSubmit.setSize(100, 30);
        y = tfInput.getY() + tfInput.getHeight() + 20;
        int x = tfInput.getX() + tfInput.getWidth() - btnSubmit.getWidth();
        btnSubmit.setLocation(x, y);
        btnSubmit.setBackground(Color.RED);
        btnSubmit.setForeground(Color.ORANGE);
        add(btnSubmit);
        btnSubmit.addActionListener(this);
        // =============
        btnCancel = new JButton();
        btnCancel.setText("Cancel");
        btnCancel.setSize(btnSubmit.getWidth(), btnSubmit.getHeight());
/*
        x = btnSubmit.getX() - btnCancel.getWidth() - 10;
*/
        btnCancel.setLocation(20, y);
        btnCancel.setBackground(Color.BLACK);
        btnCancel.setForeground(Color.BLUE);
        add(btnCancel);
        btnCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnSubmit)){
            lbTitle.setText(tfInput.getText());
            tfInput.setText("");
        }else if(e.getSource().equals(btnCancel)){
            System.exit(0);
        }
    }
}
