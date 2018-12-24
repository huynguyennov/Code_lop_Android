package com.nguyenhuy.qlsinhvien;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien quanLy = new QuanLySinhVien();
        System.out.println("In thong tin Sinh vien");
        quanLy.themSV(new SinhVien(                 // hàm khởi tạo thông thường
                "Huy",
                "111",
                18,
                true,
                3.7F
        ));
        quanLy.themSV(new SinhVien(
                "Huong",
                "112",
                19,
                false,
                4.1F
        ));
        quanLy.themSV(new SinhVien(
                "Tung",
                "113",
                20,
                true,
                2.7F
        ));
        quanLy.inToanBoSV();
        System.out.println("====Update====");
        quanLy.update(new SinhVien(
                "Huy",
                "111",
                19,
                true,
                3.5F
        ));
        quanLy.inToanBoSV();
        System.out.println("====Sort====");
        quanLy.sort();
        quanLy.inToanBoSV();
    }
}
