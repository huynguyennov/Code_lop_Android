package com.nguyenhuy.bai1;

public class HinhChuNhat extends HinhVe {

    public HinhChuNhat(ButVe butVe) {
        super(butVe);
    }

    @Override
    public void ve() {
        System.out.println("Hinh Chu nhat duoc ve bang " + this.butVe.ve());
    }
}
