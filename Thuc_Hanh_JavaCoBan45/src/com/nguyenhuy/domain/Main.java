package com.nguyenhuy.domain;

public class Main {
    public static void main(String[] args) {
        DiaChi diaChi = new DiaChi("131 Tran Phu, Ha Dong");
        NhanVien nhanVien = new NhanVien("Huy", diaChi, 8500000);
        System.out.println("Thong tin: ");
        System.out.println("Ho ten: " + nhanVien.getTen());
        System.out.println("Dia chi: " + nhanVien.getDiaChi().getTenDuong());
        System.out.println("Luong: " + nhanVien.getLuong());
    }
}
