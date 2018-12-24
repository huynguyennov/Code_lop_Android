package com.nguyenhuy.BTBS_bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private int soNguoi;
    private int soNha;
    private ArrayList<Nguoi> nguois;

    public HoDan() {
        this.nguois = new ArrayList<Nguoi>();
    }

    public void nhapHD() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin cua Ho gia dinh nay");
        System.out.println("So nguoi: "); this.soNguoi = scan.nextInt();
        System.out.println("So nha: "); this.soNha = scan.nextInt();
        for(int i = 0; i < this.soNguoi; i++){
            nguois.add(new Nguoi());
            nguois.get(i).nhap();
        }
    }

/*    private int checkExist(String name){
        for(int i = 0; i < nguois.size(); i++){
            if(nguois.get(i).getTen().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void add(Nguoi nguoi){
        nguois.add(nguoi);
    }*/

    public void showHoGD(){
        System.out.println();
        System.out.println("*** Thong tin Ho gia dinh ***");
        System.out.println("#So thanh vien trong ho: " + soNguoi);
        System.out.println("#So nha: " + soNha);
        System.out.println("#Thong tin cac thanh vien");
        for(Nguoi n : nguois){
            System.out.println("#" + n.toString());
        }
    }
}
