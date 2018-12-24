package com.nguyenhuy.btbs_qlhoadontiendien;

import java.util.Scanner;

public abstract class KhachHang {
    protected String idKH;
    protected String hoTen;
    protected String ngayHD;
    protected float soDien;
    protected float donGia;
    protected float thanhTien;

    public KhachHang(){

    }

    public KhachHang(String idKH, String hoTen, String ngayHD, float soDien, float donGia) {
        this.idKH = idKH;
        this.hoTen = hoTen;
        this.ngayHD = ngayHD;
        this.soDien = soDien;
    }

    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma khach hang");
        idKH = scan.nextLine();
        System.out.println("Nhap Ho ten khach hang");
        hoTen = scan.nextLine();
        System.out.println("Nhap ngay ra hoa don");
        ngayHD = scan.nextLine();
        System.out.println("Nhap so dien (KW)");
        soDien = scan.nextFloat();
        System.out.println("Nhap don gia");
        donGia = scan.nextFloat();
    }

    public abstract String toString();

    public String getIdKH() {
        return idKH;
    }
}
