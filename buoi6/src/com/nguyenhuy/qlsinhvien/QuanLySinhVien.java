package com.nguyenhuy.qlsinhvien;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLySinhVien {
    private ArrayList<SinhVien> mangSinhVien = new ArrayList<SinhVien>();

    private int checkExists(String maSV){                       // về xem lại
        for(int i = 0; i < mangSinhVien.size(); i++){
            if(mangSinhVien.get(i).getMaSV().equals(maSV)){     // maSinhVien.get(i).getMaSV() => lấy giá trị maSV ở vị trí từ 0 đến size() ( hết mảng), .equals(maSV) => sau đó so sánh với tham biến maSV truyền vào xem tồn tại maSV chưa
                return i;                                       // Nếu tồn tại rồi thì trả về giá trị của i ( từ 0 size())
            }
        }
        return -1;                                              // Nếu không có thì trả về -1
    }

    public void themSV(SinhVien sinhVien){                         // them thong tin Sinh Vien
        int exists = checkExists(sinhVien.getMaSV());
        if(exists == -1){
            mangSinhVien.add(sinhVien);
        }else{
            System.out.println("Sinh vien da ton tai");
        }
    }

    public void update(SinhVien sinhVien){                          // update thong tin SV theo maSV
        int exists = checkExists(sinhVien.getMaSV());
        if(exists >= 0){
            mangSinhVien.set(exists, sinhVien);
            System.out.println("Da Update thanh cong");
        }else {
            System.out.println("Sinh vien khong ton tai");
        }
    }

    public void remove(String maSV){                                // xoa sinh vien theo maSV
        int exists = checkExists(maSV);
        if(exists >= 0){
            mangSinhVien.remove(exists);
            System.out.println("Da xoa thanh cong");
        }else {
            System.out.println("Sinh vien khong ton tai");
        }
    }

    public void sort(){                                                 // sap xep theo diem giam dan
        mangSinhVien.sort(comparator);
    }

    private Comparator<SinhVien> comparator = new Comparator<SinhVien>() {      // sap xep theo diem giam dan
        @Override
        public int compare(SinhVien o1, SinhVien o2) {
            if(o1.getDiem() > o2.getDiem()){
                return -1;              // neu o1 > o2 => tra ve gia tri am va nguoc lai
            }
            return 1;
        }
    };

    public void inToanBoSV(){
        for(SinhVien s : mangSinhVien){
            System.out.println("=========");
            s.in();
        }
    }
}
