package com.nguyenhuy.btbs_qlhoadontiendien;

import java.util.Scanner;

public class KHNuocNgoai extends KhachHang {
    private String quocTich;

    public KHNuocNgoai() {
    }

    public KHNuocNgoai(String idKH, String hoTen, String ngayHD, float soDien, float donGia, String quocTich) {
        super(idKH, hoTen, ngayHD, soDien, donGia);
        this.quocTich = quocTich;
        this.thanhTien = soDien * donGia;
    }

    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin khach hang nguoi nuoc ngoai");
        super.nhap();
        System.out.println("Nhap quoc tich khach hang");
        quocTich = scan.nextLine();
    }

    @Override
    public String toString() {
        return "KHNuocNgoai{" +
                "idKH='" + idKH + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayHD='" + ngayHD + '\'' +
                ", soDien=" + soDien +
                ", donGia=" + donGia +
                ", thanhTien=" + thanhTien +
                ", quocTich='" + quocTich + '\'' +
                '}';
    }

}
