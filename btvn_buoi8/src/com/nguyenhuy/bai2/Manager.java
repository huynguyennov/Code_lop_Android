package com.nguyenhuy.bai2;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<User> users;
    private int countUser;
    private String path = "/Users/huynguyennov/btvn_buoi8/data.txt";

    public String read(){
        String path = "/Users/huynguyennov/btvn_buoi8/data.txt";
        File file = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] b = new byte[2048];
            int count = fileInputStream.read(b);
            StringBuilder stringBuilder = new StringBuilder();
            while (count != -1) {
                String s = new String(b, 0, count);
                stringBuilder.append(s);
                count = fileInputStream.read(b);
                return stringBuilder.toString();
            }
            fileInputStream.close();
        }catch (Exception exc){
            exc.printStackTrace();
        }
        return "";
    }

    public Manager() {
        countUser = 0;
        users = new ArrayList<User>();
        try {
            File file = new File(path);
            if(file.exists() == false){
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }

    }

    public void register(){
        System.out.println("Nhap UserName va password de tao tai khoan");
        Scanner scan = new Scanner(System.in);
        String userName, passWord;
        System.out.print("UserName: ");
        userName = scan.nextLine();
        System.out.print("Password: ");
        passWord = scan.nextLine();
        String data = read();
            if(data.indexOf(userName) != -1){
                System.out.println("Tai khoan da ton tai");
            }else {
                users.add(new User(userName, passWord));
                System.out.println("Tao tai khoan thanh cong!");
                countUser++;
            }
    }

    public void login(){
        System.out.println("Nhap UserName va password de dang nhap: ");
        Scanner scan = new Scanner(System.in);
        String userName, passWord;
        System.out.print("UserName: ");
        userName = scan.nextLine();
        System.out.print("Password: ");
        passWord = scan.nextLine();
        String data = read();
            String[] arrStr = data.split("\n");
            for(String s : arrStr){
                String[] arrInfor = s.split("_");
                if(userName.equals(arrInfor[0]) && passWord.equals(arrInfor[1])){
                    System.out.println("Dang nhap thanh cong!");
                    return;
                }
            }
            System.out.println("Tai khoan hoac mat khau khong chinh xac!");
    }

    public void updateUserNotNull(){
        System.out.println("=== Cap nhat thong tin con thieu ===");
        for(User user : users){
            if(user.getName() == null || user.getDateOfBirth() == null ||
                    user.getAge() == 0 || user.getJob() == null){
                user.updateInfo();
            }
        }
        System.out.println("Cap nhat thong tin thanh cong");
    }

    public void saveAllUsers(){
        for(User user : users){
            user.saveInfor();
        }
    }

    public void getAllUser(){
        System.out.println("=== get all Users ===");
        users.clear();
        String data = read();
        String[] arrStr = data.split("\n");
        for(String s : arrStr){
            String arrInfor[] = s.split("_");
            users.add(new User(arrInfor[0], arrInfor[1], arrInfor[2], arrInfor[3],
                    Integer.parseInt(arrInfor[4]), arrInfor[5]));
        }
        countUser = users.size();
    }

    public void showAllUser(){
        for(User user : users){
            user.showInfor();
        }
    }

    public void deleteUser(String userNameDelete){
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUserName().equals(userNameDelete)){
                users.remove(i);
                File file = new File(path);
                file.delete();
                saveAllUsers();
                System.out.println("Da xoa UserName " + userNameDelete);
                return;
            }
        }
        System.out.println("Khong tim thay username can xoa!");
    }
}
