package com.nguyenhuy.bai1;

public class Main {
    public static void main(String[] args) {
        ButDo butDo = new ButDo();
        ButVe butXanh = new ButXanh();

        HinhTron hinhTron = new HinhTron(butDo); // tinh da hinh
        hinhTron.ve();
        System.out.println("=======");
        HinhChuNhat hinhChuNhat = new HinhChuNhat(butXanh);
        hinhChuNhat.ve();
        System.out.println("=======");
        HinhTamGiac hinhTamGiac = new HinhTamGiac(butDo);
        hinhTamGiac.ve();


    }
}
