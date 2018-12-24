package com.nguyenhuy.bai1;

public class HinhTron extends HinhVe {

    public HinhTron(ButVe butVe) {
        super(butVe);
    }

    @Override
    public void ve() {
        System.out.println("Hinh Tron duoc ve bang " + this.butVe.ve());
    }

}
