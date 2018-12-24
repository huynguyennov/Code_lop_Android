package com.nguyenhuy.btbs_qlhoadontiendien;

import java.util.Scanner;

public class KHVietNam extends KhachHang {
    private int doiTuongKH;
    private float dinhMuc;

    public KHVietNam() {
    }

    public KHVietNam(String idKH, String hoTen, String ngayHD, float soDien, float donGia, int doiTuongKH, float dinhMuc) {
        super(idKH, hoTen, ngayHD, soDien, donGia);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
        if(soDien <= dinhMuc){
            this.thanhTien = soDien * donGia;
        }else {
            this.thanhTien = soDien * donGia * 0.9F;
        }
    }

    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin khach hang Viet Nam");
        super.nhap();
        System.out.println("Nhap doi tuong khach hang");
        doiTuongKH = scan.nextInt();
        System.out.println("Nhap dinh muc (KW)");
        dinhMuc = scan.nextFloat();
        if(soDien <= dinhMuc){
            this.thanhTien = soDien * donGia;
        }else {
            this.thanhTien = dinhMuc * donGia + (soDien - dinhMuc) * donGia * 2.5F;
        }
    }

    @Override
    public String toString() {
        return "KHVietNam{" +
                "idKH='" + idKH + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayHD='" + ngayHD + '\'' +
                ", soDien=" + soDien +
                ", donGia=" + donGia +
                ", thanhTien=" + thanhTien +
                ", doiTuongKH=" + doiTuongKH +
                ", dinhMuc=" + dinhMuc +
                '}';
    }
}
