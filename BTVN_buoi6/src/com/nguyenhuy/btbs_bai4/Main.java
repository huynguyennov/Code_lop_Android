package com.nguyenhuy.btbs_bai4;

public class Main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        tuyenSinh.add(new KhoiA("ND001", "Nguyen Van Huy", "Nam Dinh", 2, 7, 7, 5.5F));
        tuyenSinh.add(new KhoiB("HN001", "Tran Thi Dung", "Ha Noi", 3, 6.5F, 7, 6.5F));
        tuyenSinh.add(new KhoiC("TB001", "Tran Hoai Nam", "Thai Binh", 2, 7, 6, 6.5F));
        tuyenSinh.showAll();
        tuyenSinh.find("ND001");

    }
}
