package com.nghuy.chua_bai_2;

public class KhoanVayNo extends KhoanTien {
    boolean loai;
    int thoiHan;
    float laiSuat;
    String ngayTra;
    boolean xacNhanTra;

    public KhoanVayNo(String thoiGian, String diaDiem, int soTien, String lyDo, NguoiDung nguoiDung, boolean loai, int thoiHan, float laiSuat, String ngayTra, boolean xacNhanTra) {
        super(thoiGian, diaDiem, soTien, lyDo, nguoiDung);
        this.loai = loai;
        this.thoiHan = thoiHan;
        this.laiSuat = laiSuat;
        this.ngayTra = ngayTra;
        this.xacNhanTra = xacNhanTra;
    }

    @Override
    public String toString() {
        return super.toString() +
                "KhoanVayNo{" +
                "thoiHan=" + thoiHan +
                ", laiSuat=" + laiSuat +
                ", ngayTra='" + ngayTra + '\'' +
                ", xacNhanTra=" + (xacNhanTra ? "Da tra" : "Chua tra") +
                '}';
    }

    @Override
    void baoCao() {
        if(loai){
            System.out.println("=== Khoan Vay === :");
        }
        else{
            System.out.println("=== Khoan No === :");
        }
        System.out.println(this.toString());
    }
}
