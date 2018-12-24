package com.nguyenhuy.bai1;

import java.util.Scanner;

public class MyAccount extends Account {
    private String password;

    public MyAccount(String id, String name, int age, String email, String password) {
        super(id, name, age, email);
        this.password = password;
    }

    public void changePass(){
        Scanner scan = new Scanner(System.in);
        String oldPass = "";
        System.out.println("Nhap mat khau cu");
        oldPass = scan.nextLine();
        if(this.password.equals(oldPass)){
            System.out.println("Nhap mat khau moi");
            String newPass1 = "";
            newPass1 = scan.nextLine();
            System.out.println("Nhap lai mat khau moi");
            String newPass2 = "";
            newPass2 = scan.nextLine();
            if(newPass1.equals(newPass2)){
                this.password = newPass1;
                System.out.println("Thay doi mat khau thanh cong");
            }else {
                System.out.println("Mat khau khong trung nhau");
            }
        }else{
            System.out.println("Mat khau cu khong chinh xac");
            System.exit(0);
        }
    }

}
