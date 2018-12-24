package com.nguyenhuy.BTBS_bai2;

public class KySu extends CanBo{
    private String nganh;

    public KySu(String ten, int namSinh, boolean gioiTinh, String diaChi, String id, String nganh) {
        super(ten, namSinh, gioiTinh, diaChi, id);
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh=" + (gioiTinh ? "Nam" : "Nu") +
                ", diaChi='" + diaChi + '\'' +
                ", ID='" + id + '\'' +
                ", nganh='" + nganh + '\'' +
                '}';
    }
}
