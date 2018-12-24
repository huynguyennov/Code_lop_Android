package com.nguyenhuy.btbs_bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private int soNgayTro;
    private int soPhong;
    private int gia;
    private int soLuongKH;
    private ArrayList<KhachHang> khachHangs;

    public KhachSan() {
        khachHangs = new ArrayList<KhachHang>();
    }

    public void nhapKS(){
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Nhap thong tin luot khach hang den tro ***");
        System.out.print("Nhap so phong ");
        soPhong = scan.nextInt();
        System.out.print("Nhap so ngay tro ");
        soNgayTro = scan. nextInt();
        System.out.print("Nhap gia phong ");
        gia=scan.nextInt();
        System.out.print("Nhap so luong khach hang ");
        soLuongKH = scan.nextInt();
        for(int i = 0; i < soLuongKH; i++){
            khachHangs.add(new KhachHang());
            khachHangs.get(i).nhapKH();
        }
    }

    public void show(){
        System.out.println("=== Thong tin luot khach tro thue phong ===");
        System.out.println("So phong tro: " + soPhong);
        System.out.println("So ngay tro: " + soNgayTro);
        System.out.println("Gia: " + gia);
        System.out.println("Thong tin cac khach hang o tro: ");
        for(KhachHang k : khachHangs){
            System.out.println(k.toString());
        }
    }
}
