package com.nguyenhuy.login;

import com.nguyenhuy.ui.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel1 extends JPanel implements ActionListener {
    private JLabel lbTitle;
    private JTextField tfAccount;
    private JPasswordField tfPassword;
    private JButton btnSubmit;
    private JButton btnCancel;

    public MyPanel1(){
        setLayout(null);
        setBackground(Color.WHITE);

        initComps();
    }

    private void initComps() {
        lbTitle = new JLabel();
        lbTitle.setText("Login");
        lbTitle.setSize(MyFrame.W, 50);
        lbTitle.setLocation(0, 10);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setForeground(Color.RED);
        lbTitle.setFont(new Font("Apple Chancery", Font.BOLD, 20));
        add(lbTitle);
        //===============
        tfAccount = new JTextField();
        tfAccount.setSize(MyFrame.W - 30, 50);
        int y = lbTitle.getY() + lbTitle.getHeight() + 20;
        tfAccount.setLocation(10, y);
        add(tfAccount);
        //===============
        tfPassword = new JPasswordField();
        tfPassword.setSize(tfAccount.getWidth(), tfAccount.getHeight());
        y = tfAccount.getY() + tfAccount.getHeight() + 20;
        tfPassword.setLocation(tfAccount.getX(), y);
        add(tfPassword);
        //================
        btnSubmit = new JButton();
        btnSubmit.setText("OK");
        btnSubmit.setSize(100, 30);
        y = tfPassword.getY() + tfPassword.getHeight() + 20;
        int x = tfPassword.getX() + tfPassword.getWidth() - btnSubmit.getWidth();
        btnSubmit.setLocation(x, y);
        btnSubmit.setBackground(Color.RED);
        btnSubmit.setForeground(Color.ORANGE);
        add(btnSubmit);
        btnSubmit.addActionListener(this);
        //================
        btnCancel = new JButton();
        btnCancel.setText("Cancel");
        btnCancel.setSize(btnSubmit.getWidth(), btnSubmit.getHeight());
        btnSubmit.setLocation(tfPassword.getY(), btnSubmit.getY());
        btnSubmit.setBackground(Color.RED);
        btnSubmit.setForeground(Color.ORANGE);
        add(btnSubmit);
        btnSubmit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnSubmit)){
            String account = tfAccount.getText();
            String password = new String(tfPassword.getPassword());
            if(account.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog(null, "Tai khoan khong hop le",
                        "Dang nhap that bai", JOptionPane.WARNING_MESSAGE);
            }else if(e.getSource().equals(btnCancel)){
                System.exit(0);
            }

        }
    }
}
