package com.nguyenhuy.btbs_qlhoadontiendien;

import java.util.ArrayList;

public class QuanLyKH {
    ArrayList<KhachHang> khachHangs = new ArrayList<KhachHang>();

    public int checkExist(String idKH){
        for(int i = 0; i < khachHangs.size(); i++){
            if(khachHangs.get(i).getIdKH().equals(idKH)){
                return i;
            }
        }
        return -1;
    }

    public void add(KhachHang khachHang){
        /*int exist = checkExist(khachHang.getIdKH());
        if(exist <= 0){
            khachHangs.add(khachHang);
            System.out.println("Da them thong tin Khach hang");
        }else {
            System.out.println("Khach hang da ton tai");
        }*/
        khachHangs.add(khachHang);
    }

    public void nhapAll(){
        for(KhachHang k : khachHangs){
            k.nhap();
        }
    }

    public void showAll(){
        System.out.println("Thong tin toan bo cac khach hang");
        for(KhachHang k : khachHangs){
            System.out.println("======");
            System.out.println(k.toString());
        }
    }

    public void tinhTongSoDien(){
        float tongSoDienKVN = 0;
        float tongSoDienKNN = 0;
        for(KhachHang k : khachHangs){
            boolean isVN = k instanceof KHVietNam;
            if(isVN){
                KHVietNam khVietNam = (KHVietNam) k;
                tongSoDienKVN += khVietNam.soDien;
            }else {
                KHNuocNgoai khNuocNgoai = (KHNuocNgoai) k;
                tongSoDienKNN += khNuocNgoai.soDien;
            }
        }
        System.out.println("Tong so dien tieu thu cua khach hang Viet Nam: " + tongSoDienKVN);
        System.out.println("Tong so dien tieu thu cua khach hang Nuoc ngoai: " + tongSoDienKNN);
    }

    public void thanhTienTrungBinhKHNN(){
        float thanhTienTB = 0;
        int count = 0;
        float tongThanhTien = 0;
        for(KhachHang k : khachHangs){
            boolean isNN = k instanceof KHNuocNgoai;
            if(isNN){
                KHNuocNgoai khNuocNgoai = (KHNuocNgoai) k;
                tongThanhTien += khNuocNgoai.thanhTien;
                count++;
            }
        }
        thanhTienTB = tongThanhTien / (float) count;
    }


}
