package com.nguyenhuy.btbs_bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKS {
    private int soLuot;
    ArrayList<KhachSan> khachSans = new ArrayList<KhachSan>();

    public void nhapLuotKH(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luot khach hang den tro");
        soLuot = scan.nextInt();
        for(int i = 0; i < soLuot; i++){
            khachSans.add(new KhachSan());
            khachSans.get(i).nhapKS();
        }
    }

    public void showAll(){
        System.out.println("=== Thong tin tat ca cac luot thue phong ===");
        for(KhachSan k : khachSans){
            k.show();
        }
    }
}
