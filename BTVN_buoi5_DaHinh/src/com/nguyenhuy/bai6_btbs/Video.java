package com.nguyenhuy.bai6_btbs;

public class Video extends Media {
    public Video(String ten, String theLoai, int thoiLuong, String caSi_HangSanXuat, String chatLuong) {
        super(ten, theLoai, thoiLuong, caSi_HangSanXuat, chatLuong);
    }

    @Override
    public String toString() {
        return "Video{" +
                "ten='" + ten + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", thoiLuong=" + thoiLuong +
                ", caSi_HangSanXuat='" + caSi_HangSanXuat + '\'' +
                ", chatLuong='" + chatLuong + '\'' +
                '}';
    }
}
