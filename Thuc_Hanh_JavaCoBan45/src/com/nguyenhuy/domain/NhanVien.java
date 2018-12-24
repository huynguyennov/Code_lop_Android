package com.nguyenhuy.domain;

public class NhanVien extends ConNguoi {
    private float luong;

    public NhanVien() {
    }

    public NhanVien(String ten, DiaChi diaChi, float luong) {
        super(ten, diaChi);
        this.luong = luong;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
}
