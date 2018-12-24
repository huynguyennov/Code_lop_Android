package com.nguyenhuy.Demo130;

import java.util.ArrayList;

public class TongSoThuc {
    private ArrayList<Double> mangSoThuc = new ArrayList<Double>();

    public void add(Double d){
        mangSoThuc.add(d);
    }

    public void tinhTong(){
        double tong = 0;
        for(Double x : mangSoThuc){
            tong = tong + x;
        }
        System.out.println("Tong: " + tong);
    }

}
