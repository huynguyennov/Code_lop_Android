package com.nguyenhuy.btbs_bai4;

public class KhoiA extends ThiSinh {
    private float toan;
    private float ly;
    private float hoa;

    public KhoiA(String sbd, String ten, String diaChi, int uuTien, float toan, float ly, float hoa) {
        super(sbd, ten, diaChi, uuTien);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }


    @Override
    public void show() {
        System.out.println("=== Thi sinh khoi A ===");
        super.show();
        System.out.println("Diem Toan: " + toan);
        System.out.println("Diem Ly: " + ly);
        System.out.println("Diem Hoa: " + hoa);
    }
}
