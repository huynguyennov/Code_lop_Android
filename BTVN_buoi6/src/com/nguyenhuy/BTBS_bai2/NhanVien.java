package com.nguyenhuy.BTBS_bai2;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String ten, int namSinh, boolean gioiTinh, String diaChi, String id, String congViec) {
        super(ten, namSinh, gioiTinh, diaChi, id);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh=" + (gioiTinh ? "Nam" : "Nu") +
                ", diaChi='" + diaChi + '\'' +
                ", ID='" + id + '\'' +
                ", congViec='" + congViec + '\'' +
                '}';
    }
}
