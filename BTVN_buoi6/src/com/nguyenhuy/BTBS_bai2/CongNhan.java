package com.nguyenhuy.BTBS_bai2;

public class CongNhan extends CanBo{
    private float bac;

    public CongNhan(String ten, int namSinh, boolean gioiTinh, String diaChi, String id, float bac) {
        super(ten, namSinh, gioiTinh, diaChi, id);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh=" + (gioiTinh ? "Nam" : "Nu") +
                ", diaChi='" + diaChi + '\'' +
                ", ID='" + id + '\'' +
                ", bac=" + bac +
                '}';
    }
}
