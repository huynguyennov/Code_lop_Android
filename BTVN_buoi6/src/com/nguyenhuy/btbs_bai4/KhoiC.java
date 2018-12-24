package com.nguyenhuy.btbs_bai4;

public class KhoiC extends ThiSinh {
    private float van;
    private float su;
    private float dia;

    public KhoiC(String sbd, String ten, String diaChi, int uuTien, float van, float su, float dia) {
        super(sbd, ten, diaChi, uuTien);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    @Override
    public void show() {
        System.out.println("=== Thi sinh khoi B ===");
        super.show();
        System.out.println("Diem Van: " + van);
        System.out.println("Diem Su: " + su);
        System.out.println("Diem Dia: " + dia);
    }
}
