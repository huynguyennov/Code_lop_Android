package com.nguyenhuy.BTBS_QLSVPoly;

import java.util.ArrayList;

public class QLSinhVien {
    ArrayList<SinhVien> sinhViens = new ArrayList<SinhVien>();

    private int checkExistID(String id){
        for(int i = 0; i < sinhViens.size(); i++){
            if(sinhViens.get(i).getMaSV().equals(id)){
                return i;
            }
        }
        return -1;
    }

    private int checkExistName(String ten){
        for(int i = 0; i < sinhViens.size(); i++){
            if(sinhViens.get(i).getTen().equals(ten)){
                return i;
            }
        }
        return -1;
    }

    public void add(SinhVien sinhVien){
        int exist = checkExistID(sinhVien.getMaSV());
        if(exist == -1){
            sinhViens.add(sinhVien);
            System.out.println("#Da them Sinh vien");
        }else{
            System.out.println("Sinh vien da ton tai");
        }
    }

    public void showAll(){
        System.out.println();
        System.out.println("*** Danh sach tat ca Sinh Vien ***");
        for(SinhVien s : sinhViens){
            s.show();
        }
    }

    public void showWithScore(float diem1, float diem2){
        System.out.println();
        System.out.println("*** Danh sach Sinh vien trong khoang diem " + diem1 + " den " + diem2 + " ***");
        for(SinhVien s: sinhViens){
            if(s.getDiem() >= diem1 && s.getDiem() <= diem2){
                s.show();
            }
        }
    }

    public void find(String ten){
        int exist = checkExistName(ten);
        System.out.println();
        System.out.println("*** Danh sach sinh vien co ten " + ten + " ***");
        if(exist >= 0){
            for(SinhVien s : sinhViens){
                if(s.getTen().equals(ten)){
                    s.show();
                }
            }
        }else {
            System.out.println("Khong co Sinh vien can tim");
        }
    }

    public void edit(String id, SinhVien sinhVien){
        System.out.println();
        int exist = checkExistID(id);
        if(exist >= 0){
            sinhViens.set(exist, sinhVien);
            System.out.println("#Da sua thong tin Sinh vien co ID: " + id);
        }else {
            System.out.println("Sinh vien khong ton tai");
        }
    }

    public void remove(String id){
        System.out.println();
        int exist = checkExistID(id);
        if(exist >= 0){
            sinhViens.remove(exist);
            System.out.println("Da xoa Sinh vien co ID: " + id);
        }else {
            System.out.println("Sinh vien khong ton tai");
        }
    }
}
