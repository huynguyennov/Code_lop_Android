package com.nguyenhuy.bai6_btbs;

public abstract class Media {
    protected String ten;
    protected String theLoai;
    protected int thoiLuong;
    protected String caSi_HangSanXuat;
    protected String chatLuong;

    public Media(String ten, String theLoai, int thoiLuong, String caSi_HangSanXuat, String chatLuong) {
        this.ten = ten;
        this.theLoai = theLoai;
        this.thoiLuong = thoiLuong;
        this.caSi_HangSanXuat = caSi_HangSanXuat;
        this.chatLuong = chatLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public abstract String toString();
}
