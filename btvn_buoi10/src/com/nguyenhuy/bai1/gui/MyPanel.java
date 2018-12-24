package com.nguyenhuy.bai1.gui;

import com.nguyenhuy.bai1.GiaiThuat.PTBac2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbTitle;
    private JLabel lbNhapA;
    private JTextField tfA;
    private JLabel lbNhapB;
    private JTextField tfB;
    private JLabel lbNhapC;
    private JTextField tfC;
    private JLabel lbThongBao;
    private JLabel lbKetQua;
    private JButton btnGiaiPT;
    public MyPanel() {
        setLayout(null);
        setBackground(Color.GRAY);

        initComp();
    }

    private void initComp() {
        int fontNhap = 20;
        lbTitle = new JLabel();
        lbTitle.setText("Giai phuong trinh bac 2");
        lbTitle.setSize(Gui.W, 65);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setForeground(Color.BLUE);
        lbTitle.setFont(new Font(null, Font.BOLD, 25));
        add(lbTitle);
        //===============
        lbNhapA = new JLabel();
        lbNhapA.setText("Nhap A: ");
        lbNhapA.setSize(145, 40);
        int y = lbTitle.getY() + lbTitle.getHeight() + 20;
        lbNhapA.setLocation(0, y);
        lbNhapA.setHorizontalAlignment(SwingConstants.RIGHT);
        lbNhapA.setForeground(Color.CYAN);
        lbNhapA.setFont(new Font(null, 0, fontNhap));
        add(lbNhapA);
        //***
        tfA = new JTextField();
        tfA.setSize(Gui.W - lbNhapA.getWidth() - 80, lbNhapA.getHeight());
        int x = lbNhapA.getX() + lbNhapA.getWidth() + 3;
        tfA.setLocation(x , lbNhapA.getY());
        add(tfA);

        //================
        lbNhapB = new JLabel();
        lbNhapB.setText("Nhap B: ");
        lbNhapB.setSize(lbNhapA.getWidth(), lbNhapA.getHeight());
        y = lbNhapA.getY() + lbNhapA.getHeight() + 20;
        lbNhapB.setLocation(0, y);
        lbNhapB.setHorizontalAlignment(SwingConstants.RIGHT);
        lbNhapB.setForeground(Color.CYAN);
        lbNhapB.setFont(new Font(null, 0, fontNhap));
        add(lbNhapB);
        //***
        tfB = new JTextField();
        tfB.setSize(tfA.getWidth(), tfA.getHeight());
        tfB.setLocation(tfA.getX() , lbNhapB.getY());
        add(tfB);

        //================
        lbNhapC = new JLabel();
        lbNhapC.setText("Nhap C: ");
        lbNhapC.setSize(lbNhapA.getWidth(), lbNhapA.getHeight());
        y = lbNhapB.getY() + lbNhapB.getHeight() + 20;
        lbNhapC.setLocation(0, y);
        lbNhapC.setHorizontalAlignment(SwingConstants.RIGHT);
        lbNhapC.setForeground(Color.CYAN);
        lbNhapC.setFont(new Font(null, 0, fontNhap));
        add(lbNhapC);
        //***
        tfC = new JTextField();
        tfC.setSize(tfA.getWidth(), tfA.getHeight());
        tfC.setLocation(tfA.getX() , lbNhapC.getY());
        add(tfC);

        //=================
        lbThongBao = new JLabel();
        lbThongBao.setText("Ket qua: ");
        lbThongBao.setSize(lbNhapA.getWidth(), lbNhapA.getHeight());
        y = lbNhapC.getY() + lbNhapC.getHeight() + 20;
        lbThongBao.setLocation(0, y);
        lbThongBao.setHorizontalAlignment(SwingConstants.RIGHT);
        lbThongBao.setForeground(Color.BLACK);
        lbThongBao.setFont(new Font(null, 0, fontNhap));
        add(lbThongBao);
        //***
        lbKetQua = new JLabel();
        lbKetQua.setText("");
        lbKetQua.setSize(tfA.getWidth() * 2 / 3, tfA.getHeight());
        lbKetQua.setLocation(tfC.getX(), lbThongBao.getY());
        lbKetQua.setHorizontalAlignment(SwingConstants.CENTER);
        lbKetQua.setForeground(Color.RED);
        lbKetQua.setBackground(Color.ORANGE);
        lbKetQua.setFont(new Font(null, 0, 15));
        add(lbKetQua);
        //***
        btnGiaiPT = new JButton();
        btnGiaiPT.setSize(tfA.getWidth() - lbKetQua.getWidth() - 3, lbKetQua.getHeight());
        x = lbKetQua.getX() + lbKetQua.getWidth() + 3;
        btnGiaiPT.setLocation(x, lbKetQua.getY());
        btnGiaiPT.setText("Giai PT");
        btnGiaiPT.setForeground(Color.BLUE);
        add(btnGiaiPT);
        btnGiaiPT.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(tfA.getText().isEmpty() || tfB.getText().isEmpty() || tfC.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nhap day du cac he so",
                    "Nhap khong hop le", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int a = Integer.parseInt(tfA.getText());
        int b = Integer.parseInt(tfB.getText());
        int c = Integer.parseInt(tfC.getText());
        PTBac2 ptBac2 = new PTBac2(a, b, c);
        lbKetQua.setText(ptBac2.giaiPT());
    }
}
