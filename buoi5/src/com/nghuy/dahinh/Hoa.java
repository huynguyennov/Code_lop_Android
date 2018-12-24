package com.nghuy.dahinh;

public class Hoa extends ConNguoi {

    public Hoa(String ten, int tuoi, boolean gioiTinh, String diaChi, DongVat dongVat) {
        super(ten, tuoi, gioiTinh, diaChi, dongVat);
    }

    void datMeoDiShoppong(){
        System.out.println("Dat meo di Shopping!");
    }


}
