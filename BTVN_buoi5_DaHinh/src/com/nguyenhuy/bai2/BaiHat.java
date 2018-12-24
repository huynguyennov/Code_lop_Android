package com.nguyenhuy.bai2;

public class BaiHat extends AmNhac {

    public BaiHat(String ten, String caSi, float dungLuongKB, float thoiGian) {
        super(ten, caSi, dungLuongKB, thoiGian);
    }

    @Override
    public void inThongTin() {
        System.out.println("Thong tin bai hat: ");
        super.inThongTin();
    }
}
