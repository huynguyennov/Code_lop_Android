package com.nghuy.dahinh;

public class Main {
    public static void main(String[] args) {
        Cho cho1 = new Cho("Cho Bitpull", 2,
                10.5F,"Vang");
        Meo meo1 = new Meo("Boss", 3,
                3.2F, "Xam");
        Thanh thanh = new Thanh("Thanh", 25,
                true, "Ha Noi", cho1); // tính đa hình ở
        thanh.inThongTin();
        thanh.datChoDiDao();
        System.out.println("=========");
        Hoa hoa = new Hoa("Hoa",22,
                false, "Ha Noi", meo1 ); // tính đa hình ở đây
        hoa.inThongTin();
        hoa.datMeoDiShoppong();
        System.out.println("=========");
        ConNguoi conNguoi = new Thanh("Thanh", 22, true,"Ha Noi", cho1);
        conNguoi.inThongTin(); //gọi phương thức inThongTin đã override của class Thanh - nếu chưa override thì k
    }
}
