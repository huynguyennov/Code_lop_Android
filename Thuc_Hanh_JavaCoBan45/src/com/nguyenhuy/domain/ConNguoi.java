package com.nguyenhuy.domain;

public class ConNguoi {
    private String ten;
    private DiaChi diaChi;

    public ConNguoi() {
    }

    public ConNguoi(String ten, DiaChi diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

}
