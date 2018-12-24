package com.nguyenhuy.bai1;

public abstract class HinhVe {
    protected ButVe butVe;

    public HinhVe(ButVe butVe) {
        this.butVe = butVe;
    }

    public abstract void ve();
}
