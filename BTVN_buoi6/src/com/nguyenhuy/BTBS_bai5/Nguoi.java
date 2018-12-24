package com.nguyenhuy.BTBS_bai5;

import java.util.Scanner;

public class Nguoi {
    private String ten;
    private int tuoi;
    protected int namSinh;
    private String nghe;

    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("#Nhap thong tin cua nguoi trong gia dinh");
        System.out.print("Ten: "); this.ten = scan.nextLine();
        System.out.print("Tuoi: "); this.tuoi = scan.nextInt();
        System.out.print("Nam sinh: "); this.namSinh = scan.nextInt();
        scan.nextLine();
        System.out.print("Nghe nghiep: "); this.nghe = scan.nextLine();
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", namSinh=" + namSinh +
                ", nghe='" + nghe + '\'' +
                '}';
    }
}
