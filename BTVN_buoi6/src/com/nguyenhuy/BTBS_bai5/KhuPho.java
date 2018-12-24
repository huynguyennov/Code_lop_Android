package com.nguyenhuy.BTBS_bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> hoDans;

    public KhuPho() {
        this.hoDans = new ArrayList<HoDan>();
    }

    public void addN(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong ho dan muon nhap vao");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            hoDans.add(new HoDan());
            hoDans.get(i).nhapHD();
        }
    }

    public void showAllHD(){
        for(HoDan h : hoDans){
            h.showHoGD();
        }
    }
}
