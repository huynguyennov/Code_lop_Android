package com.nguyenhuy.btbs_qlhoadontiendien;

public class Main {
    public static void main(String[] args) {
        QuanLyKH quanLyKH = new QuanLyKH();
        quanLyKH.add(new KHVietNam());
        quanLyKH.add(new KHVietNam());
        quanLyKH.add(new KHVietNam());
        quanLyKH.add(new KHNuocNgoai());
        quanLyKH.add(new KHNuocNgoai());

        quanLyKH.nhapAll();
        quanLyKH.showAll();
    }
}
