package com.nguyenhuy.btbs_bai4;

public abstract class ThiSinh {
    protected String sbd;
    protected String ten;
    protected String diaChi;
    protected int uuTien;

    public ThiSinh(String sbd, String ten, String diaChi, int uuTien) {
        this.sbd = sbd;
        this.ten = ten;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public String getSbd() {
        return sbd;
    }

    public void show(){
        System.out.println("So bao danh: " + sbd);
        System.out.println("Ho ten: " + ten);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Uu tien: " + uuTien);
    }
}
