package com.nguyenhuy.bai2;

public class VideoAmNhac extends AmNhac {
    protected String album;

    public VideoAmNhac(String ten, String caSi, float dungLuongKB, float thoiGian, String album) {
        super(ten, caSi, dungLuongKB, thoiGian);
        this.album = album;
    }


    @Override
    public void inThongTin() {
        System.out.println("Thong tin MV: ");
        super.inThongTin();
        System.out.println("Album: " + album);
    }
}
