package com.nghuy.chua_bai_2;

public class KhoanThuChi extends KhoanTien {
    boolean loai;

    public KhoanThuChi(String thoiGian, String diaDiem, int soTien, String lyDo, NguoiDung nguoiDung, boolean loai) {
        super(thoiGian, diaDiem, soTien, lyDo, nguoiDung);
        this.loai = loai;
    }

    @Override
    void baoCao() {
        if(loai){
            System.out.println("=== Khoan Thu ===:");
        }
        else {
            System.out.println("=== Khoan Chi ===:");
        }
        System.out.println(this.toString());
    }


}
