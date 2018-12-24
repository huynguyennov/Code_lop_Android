package com.nghuy.chua_bai_2;

public class NguoiDung {
    String ten;
    int tuoi;
    boolean gioiTinh;
    String sdt;
    String diaChi;

    public NguoiDung(String ten, int tuoi, boolean gioiTinh, String sdt, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + (gioiTinh ? "Nam" : "Nu") +
                ", sdt='" + sdt + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
