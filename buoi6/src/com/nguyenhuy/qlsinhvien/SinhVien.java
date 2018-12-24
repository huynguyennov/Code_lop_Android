package com.nguyenhuy.qlsinhvien;

public class SinhVien {
    private String ten;
    private String maSV;
    private int tuoi;
    private boolean gioiTinh;
    private float diem;

    public SinhVien(String ten, String maSV, int tuoi, boolean gioiTinh, float diem) {
        this.ten = ten;
        this.maSV = maSV;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

    public void in(){
        System.out.println("Ho ten: " + ten);
        System.out.println("Ma Sinh vien: " + maSV);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + (gioiTinh ? "Nam" : "Nu"));
        System.out.println("Diem: " + diem);
    }

    public String getMaSV() {
        return maSV;
    }

    public float getDiem() {
        return diem;
    }
}
