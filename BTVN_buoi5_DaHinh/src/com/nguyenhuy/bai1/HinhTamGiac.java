package com.nguyenhuy.bai1;

public class HinhTamGiac extends HinhVe {

    public HinhTamGiac(ButVe butVe) {
        super(butVe);
    }

    @Override
    public void ve() {
        System.out.println("Hinh Tam giac duoc ve bang " + this.butVe.ve());
    }
}
