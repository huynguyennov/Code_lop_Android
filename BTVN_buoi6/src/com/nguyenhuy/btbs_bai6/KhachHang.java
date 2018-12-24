package com.nguyenhuy.btbs_bai6;

import java.util.Scanner;

public class KhachHang {
    private String ten;
    private int namSinh;
    private String cmnd;

    public void nhapKH(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ho ten khach hang "); ten = scan.nextLine();
        System.out.print("Nam sinh "); namSinh = scan.nextInt();
        scan.nextLine();
        System.out.print("So CMND "); cmnd = scan.nextLine();
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", cmnd='" + cmnd + '\'' +
                '}';
    }
}
