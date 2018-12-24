package com.nguyenhuy.BTBS_QLSVPoly;

public class SinhVien {
    private String ten;
    private String maSV;
    private float diem;

    public SinhVien(String ten, String maSV, float diem) {
        this.ten = ten;
        this.maSV = maSV;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public float getDiem() {
        return diem;
    }

    public void show(){
        System.out.println("=====");
        System.out.println("Ho ten: " + ten);
        System.out.println("Ma Sinh vien: " + maSV);
        System.out.println("Diem: " + diem);
    }
}
