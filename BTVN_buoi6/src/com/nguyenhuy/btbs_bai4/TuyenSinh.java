package com.nguyenhuy.btbs_bai4;

import java.util.ArrayList;

public class TuyenSinh {
    ArrayList<ThiSinh> thiSinhs = new ArrayList<ThiSinh>();

    private int checkExist(String sbd){
        for(int i = 0; i < thiSinhs.size(); i++){
            if(thiSinhs.get(i).getSbd().equals(sbd)){
                return i;
            }
        }
        return -1;
    }

    public void add(ThiSinh thiSinh){
        int exist = checkExist(thiSinh.getSbd());
        if(exist == -1){
            thiSinhs.add(thiSinh);
            System.out.println("Da them thi sinh thanh cong");
        }else {
            System.out.println("Thi sinh da ton tai");
        }
    }

    public void find(String sbd){
        int exist = checkExist(sbd);
        if(exist >= 0){
            System.out.println("Thong tin thi sinh co SBD: " + sbd);
            thiSinhs.get(exist).show();
        }else {
            System.out.println("Thi sinh khong ton tai");
        }
    }

    public void showAll(){
        System.out.println("=== Thong tin toan bo cac thi sinh ===");
        for(ThiSinh t : thiSinhs){
            t.show();
        }
    }
}
