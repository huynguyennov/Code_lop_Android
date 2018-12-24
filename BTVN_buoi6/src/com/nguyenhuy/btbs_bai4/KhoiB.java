package com.nguyenhuy.btbs_bai4;

public class KhoiB extends ThiSinh {
    private float toan;
    private float hoa;
    private float sinh;

    public KhoiB(String sbd, String ten, String diaChi, int uuTien, float toan, float hoa, float sinh) {
        super(sbd, ten, diaChi, uuTien);
        this.toan = toan;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    @Override
    public void show() {
        System.out.println("=== Thi sinh khoi B ===");
        super.show();
        System.out.println("Diem Toan: " + toan);
        System.out.println("Diem Hoa: " + hoa);
        System.out.println("Diem Sinh: " + sinh);
    }
}
