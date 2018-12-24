package com.nguyenhuy.BTBS_bai2;

import java.util.ArrayList;

public class QLCanBo {
    private ArrayList<CanBo> canBos = new ArrayList<CanBo>();

    private int checkExistID(String id){
        for(int i = 0; i < canBos.size(); i++){
            if(canBos.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public int checkExistName(String ten){
        for(int i = 0; i < canBos.size(); i++){
            if(canBos.get(i).getTen().equals(ten)){
                return i;
            }
        }
        return -1;
    }

    public void add(CanBo canBo){
        int exist = checkExistID(canBo.getId());
        if(exist == -1){
            canBos.add(canBo);
            System.out.println("#Da them Can Bo moi");
        }else {
            System.out.println("#Can bo da ton tai");
        }
    }

    public void edit(CanBo canBo){
        System.out.println();
        int exist = checkExistID(canBo.getId());
        if(exist >= 0){
            canBos.set(exist, canBo);
            System.out.println("#Da sua thong tin Can Bo co ID: " + canBo.getId());
        }else {
            System.out.println("#Can bo can sua thong tin khong ton tai");
        }
    }

    public void find(String ten){
        System.out.println();
        int exist = checkExistName(ten);
        if(exist >= 0){
            System.out.println("*** Thong tin cac can bo co ten " + ten + " ***");
            for(int i = 0; i < canBos.size(); i++){
                if(canBos.get(i).getTen().equals(ten)){
                    System.out.println(canBos.get(i).toString());
                }
            }
        }else {
            System.out.println("Khong tim thay Can bo co ten " + ten);
        }
    }

    public void remove(String id){
        System.out.println();
        int exist = checkExistID(id);
        if(exist >= 0){
            System.out.println("Da xoa thong tin Can bo co ID: " + id);
            canBos.remove(exist);
        }
    }

    public void showAll(){
        System.out.println();
        System.out.println("*** Danh sach can bo ***");
        for(CanBo c : canBos){
            System.out.println(c.toString());
        }
    }
}
