package com.nguyenhuy.BTBS_bai2;

public abstract class CanBo {
    protected String ten;
    protected int namSinh;
    protected boolean gioiTinh;
    protected String diaChi;
    protected String id;

    public CanBo(String ten, int namSinh, boolean gioiTinh, String diaChi, String id) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public abstract String toString();
}
