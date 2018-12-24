package com.nguyenhuy.bai2;

public abstract class AmNhac {
    protected String ten;
    protected String caSi;
    protected float dungLuongKB;
    protected float thoiGian;

    public AmNhac(String ten, String caSi, float dungLuongKB, float thoiGian){
        this.ten = ten;
        this.caSi = caSi;
        this.dungLuongKB = dungLuongKB;
        this.thoiGian = thoiGian;
    }

    public void inThongTin(){
        System.out.println("Ten: " + ten);
        System.out.println("Ca si: " + caSi);
        System.out.println("Dung luong (KB): " + dungLuongKB);
        System.out.println("Thoi gian (s): " + thoiGian);
    }

    public void play(){
        System.out.println("Play bai hat");
    }

    public void pause(){
        System.out.println("Pause bai hat");
    }

    public void next(){
        System.out.println("Next sang bai moi");
    }

    public void back(){
        System.out.println("Quay lai bai truoc do");
    }
}
