package com.nguyenhuy.bai2;

public class Main {
    public static void main(String[] args) {
        BaiHat baiHat = new BaiHat("Di qua bong dem", "Le Cat Trong Ly", 3958.2F, 235F);
        baiHat.inThongTin();
        baiHat.play();
        System.out.println("========");
        VideoAmNhac mv = new VideoAmNhac("Nhung ke mong mo", "Noo Phuoc Thinh", 30549.5F,
                316, "Ke mong mo");
        mv.inThongTin();
        mv.play();
        mv.next();

    }
}
