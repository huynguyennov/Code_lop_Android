package com.nghuy.chua_bai_2;

public class Main {
    public static void main(String[] args) {
        NguoiDung nguoiDung = new NguoiDung(
                "Nguyen van A",
                34,
                true,
                "0868908672",
                "Ha Noi");
        KhoanThuChi thuChi = new KhoanThuChi(
                "20/10/2018",
                "Ho tung mau",
                1000000,
                "Vay mua xe",
                nguoiDung,
                true);
        thuChi.baoCao();
        System.out.println("========");
        KhoanVayNo vayNo = new KhoanVayNo(
                "10/2/2019",
                "Ha noi",
                1000000,
                "Vay mua nha",
                nguoiDung, false,
                2,
                5.2F,
                "15/5/2019",
                false
        );
        vayNo.baoCao();
    }
}
