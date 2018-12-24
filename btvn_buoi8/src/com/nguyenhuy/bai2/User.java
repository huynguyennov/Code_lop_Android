package com.nguyenhuy.bai2;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class User {
    private String userName;
    private String password;
    private String name;
    private String dateOfBirth;
    private int age;
    private String job;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String userName, String password, String name, String dateOfBirth, int age, String job) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.job = job;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void updateInfo(){
        System.out.println("UserName: " + this.userName);
        Scanner scan = new Scanner(System.in);
        System.out.println("#Moi cap nhat thong tin");
        System.out.print("name: ");
        name = scan.nextLine();
        System.out.print("Date of Birth: ");
        dateOfBirth = scan.nextLine();
        System.out.print("Age: ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.print("Job: ");
        job = scan.nextLine();
        System.out.println("Thong tin da duoc cap nhat");
    }

    public void showInfor(){
        System.out.println("=== Thong tin tai khoan ===");
        System.out.println("Name: " + name);
        System.out.println("UserName: " + userName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
    }

    public void changePassword(){
        System.out.println("Thay doi mat khau ===");
        Scanner scan = new Scanner(System.in);
        String oldPass;
        System.out.print("Nhap mat khau cu: ");
        oldPass = scan.nextLine();
        if(oldPass.equals(this.password)){
            while ( 1 == 1) {
                String newPass, newPass2;
                System.out.print("Nhap mat khau moi: ");
                newPass = scan.nextLine();
                System.out.print("Xac nhan lai mat khau moi: ");
                newPass2 = scan.nextLine();
                if (newPass.equals(newPass2)) {
                    this.password = newPass;
                    System.out.println("Da thay doi mat khau!");
                    return;
                } else {
                    System.out.println("Mat khau xac nhan khong trung nhau!");
                }
            }
        }else {
            System.out.println("Nhap mat khau sai");
        }
    }

    public void saveInfor(){
        String path = "/Users/huynguyennov/btvn_buoi8/data.txt";
        String infor = userName + "_" + password + "_" + name + "_"
                + dateOfBirth + "_" + age + "_" + job + "\n";
        try {
            File file = new File(path);
            if(file.exists() == false){
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(infor.getBytes());
            System.out.println("#Da luu du lieu tai khoan");
            fileOutputStream.close();
        }catch (Exception exc){
            exc.printStackTrace();
        }

    }

}