package com.nghuy.dahinh;

public class Thanh extends ConNguoi {

    public Thanh(String ten, int tuoi, boolean gioiTinh, String diaChi, DongVat dongVat) {
        super(ten, tuoi, gioiTinh, diaChi, dongVat);
    }

    void datChoDiDao(){
        System.out.println("Dat cho di dao nao!");
    }

    @Override
    void inThongTin() {
        System.out.println("Day la thong tin cua Thanh");
        super.inThongTin();
    }
}
