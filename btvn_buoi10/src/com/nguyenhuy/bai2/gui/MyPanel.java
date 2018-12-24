package com.nguyenhuy.bai2.gui;

import com.nguyenhuy.bai2.MyPrime;
import com.nguyenhuy.bai2.RandomAccessFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbSoKT;
    private JTextField tfSoKT;
    private JButton btnKiemTra;
    private JLabel lbKhoangN;
    private JTextField tfKhoangN;
    private JButton btnLietKe;
    private JTextArea taTest;

    public MyPanel() {
        setLayout(null);
        setBackground(Color.GRAY);

        initComp();
    }

    private void initComp() {
        lbSoKT = new JLabel();
        lbSoKT.setText("So kiem tra: ");
        lbSoKT.setSize(Gui.W / 3, Gui.H / 6);
        lbSoKT.setLocation(0, Gui.H / 6);
        lbSoKT.setForeground(Color.BLUE);
        lbSoKT.setHorizontalAlignment(SwingConstants.RIGHT);
        lbSoKT.setFont(new Font(null, 0, 20));
        add(lbSoKT);
        //***
        tfSoKT = new JTextField();
        tfSoKT.setSize(Gui.W / 3, Gui.H / 6);
        int x = lbSoKT.getX() + lbSoKT.getWidth() + 3;
        tfSoKT.setLocation(x, lbSoKT.getY());
        add(tfSoKT);
        //***
        btnKiemTra = new JButton();
        btnKiemTra.setText("Kiem Tra");
        btnKiemTra.setForeground(Color.RED);
        btnKiemTra.setBackground(Color.CYAN);
        btnKiemTra.setSize(tfSoKT.getWidth() / 2, tfSoKT.getHeight());
        x = tfSoKT.getX() + tfSoKT.getWidth() + 3;
        btnKiemTra.setLocation(x, tfSoKT.getY());
        add(btnKiemTra);
        btnKiemTra.addActionListener(this);
        //================
        lbKhoangN = new JLabel();
        lbKhoangN.setText("Khoang N: ");
        lbKhoangN.setSize(lbSoKT.getWidth(), lbSoKT.getHeight());
        int y = lbSoKT.getY() + lbSoKT.getHeight() + Gui.H / 8;
        lbKhoangN.setLocation(0, y);
        lbKhoangN.setForeground(Color.BLUE);
        lbKhoangN.setHorizontalAlignment(SwingConstants.RIGHT);
        lbKhoangN.setFont(new Font(null, 0, 20));
        add(lbKhoangN);
        //***
        tfKhoangN = new JTextField();
        tfKhoangN.setSize(tfSoKT.getWidth(), tfSoKT.getHeight());
        x = lbKhoangN.getX() + lbKhoangN.getWidth() + 3;
        tfKhoangN.setLocation(x, lbKhoangN.getY());
        add(tfKhoangN);
        //***
        btnLietKe = new JButton();
        btnLietKe.setText("Liet Ke");
        btnLietKe.setForeground(Color.RED);
        btnLietKe.setBackground(Color.CYAN);
        btnLietKe.setSize(btnKiemTra.getWidth(), btnKiemTra.getHeight());
        x = tfKhoangN.getX() + tfKhoangN.getWidth() + 3;
        btnLietKe.setLocation(x, tfKhoangN.getY());
        add(btnLietKe);
        btnLietKe.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyPrime myPrime = new MyPrime();
        String soKt = tfSoKT.getText();
        String khoangN = tfKhoangN.getText();
        if(e.getSource().equals(btnKiemTra)) {
            if (soKt.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Khong co du lieu",
                        "Loi nhap", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                // kiểm tra xem chuỗi là số hay chữ
                Pattern pattern = Pattern.compile("\\d*");
                Matcher matcher = pattern.matcher(soKt);
                if (matcher.matches() == false) {   // matcher.matches() == false => la chu
                    JOptionPane.showMessageDialog(null, "Moi nhap so",
                            "Loi nhap", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            int intKT = Integer.parseInt(soKt);
            if(myPrime.kiemTraSNT(intKT)){
                JOptionPane.showMessageDialog(null, ("So " + intKT + " la so nguyen to"),
                        "Kiem tra so nguyen to", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, ("So " + intKT + " khong la so nguyen to"),
                        "Kiem tra so nguyen to", JOptionPane.INFORMATION_MESSAGE);
            }
        }else if(e.getSource().equals(btnLietKe)){
            if (khoangN.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Khong co du lieu",
                        "Loi nhap", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                Pattern pattern = Pattern.compile("\\d*");
                Matcher matcher = pattern.matcher(khoangN);
                if (matcher.matches() == false) {
                    JOptionPane.showMessageDialog(null, "Moi nhap so",
                            "Loi nhap", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            int intN = Integer.parseInt(khoangN);
            JOptionPane.showMessageDialog(null, myPrime.lietKe(intN),
                    "Liet ke cac so nguyen to", JOptionPane.INFORMATION_MESSAGE);
            RandomAccessFile randomAccessFile = new RandomAccessFile();
            randomAccessFile.write(myPrime.lietKe(intN));
        }

    }
}
