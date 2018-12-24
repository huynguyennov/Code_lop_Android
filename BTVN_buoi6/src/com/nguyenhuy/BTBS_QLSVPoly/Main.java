package com.nguyenhuy.BTBS_QLSVPoly;

public class Main {
    public static void main(String[] args) {
        QLSinhVien qlSinhVien = new QLSinhVien();
        qlSinhVien.add(new SinhVien("Huy", "DPT001", 3.8F));
        qlSinhVien.add(new SinhVien("Hieu", "DPT002", 1.9F));
        qlSinhVien.add(new SinhVien("Huu", "DPT003", 3.2F));
        qlSinhVien.add(new SinhVien("Huy", "DPT004", 2.9F));
        qlSinhVien.showAll();
        qlSinhVien.showWithScore(2.7F, 3.5F);
        qlSinhVien.find("Huy");
        qlSinhVien.edit("DPT004", new SinhVien("Toan", "DPT004", 2.9F));
        qlSinhVien.remove("DPT003");
        qlSinhVien.showAll();
    }
}
