package com.nguyenhuy.bai6_btbs;

public class Song extends Media {
    private String album;

    public Song(String ten, String theLoai, int thoiLuong, String caSi_HangSanXuat, String chatLuong, String album) {
        super(ten, theLoai, thoiLuong, caSi_HangSanXuat, chatLuong);
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                ", ten='" + ten + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", thoiLuong=" + thoiLuong +
                ", caSi_HangSanXuat='" + caSi_HangSanXuat + '\'' +
                "album='" + album + '\'' +
                ", chatLuong='" + chatLuong + '\'' +
                '}';
    }
}
