package com.nghuy.dahinh;

public class Meo extends DongVat{

    public Meo(String ten, int tuoi, float canNang, String mauLong) {
        super(ten, tuoi, canNang, mauLong);
    }

    public void batChuot(){
        System.out.println("Bat chuot gioi!");
    }

}
