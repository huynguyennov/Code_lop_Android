package com.nguyenhuy.mang;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /*MangTinh mangTinh = new MangTinh(10);
        mangTinh.sapXepTang();
        mangTinh.inMang();
        mangTinh.sapXepGiam();
        mangTinh.inMang();*/

        MangDong mangDong = new MangDong();
        mangDong.add(10);       // them 1 gia tri vao cuoi mang
        mangDong.add(20);
        mangDong.add(12);
        mangDong.add(15);
        mangDong.inMang();
        mangDong.add(2,100);
        mangDong.inMang();
        ArrayList<Integer> mangDong2 = new ArrayList<>();
        mangDong2.add(1);
        mangDong2.add(0);
        mangDong2.add(2);
        mangDong.addAll(mangDong2);
        mangDong.inMang();
        mangDong.addAll(1, mangDong2);
        mangDong.inMang();
        /*mangDong.set(1, 1000);*/
        mangDong.inMang();
        System.out.println();
        int index = mangDong.indexOf(100);
        System.out.println("Vi tri chua gia tri 100: " + index);
        boolean check = mangDong.checkContainAll(mangDong2);
        System.out.println(check);
        mangDong.sort();
        mangDong.inMang();
    }
}
