package com.nguyenhuy.bai3;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Province> provinces;

    public Menu() {
        provinces = new ArrayList<Province>();
    }

    private int chechExist(int idP){
        for(int i = 0; i < provinces.size(); i++){
            if(provinces.get(i).getId() == idP){
                return i;
            }
        }
        return -1;
    }

    public void addProvince(Province province){
        int exist = chechExist(province.getId());
        if(exist == -1){
            provinces.add(province);
            System.out.println("#Da them Tinh thanh");
        }else {
            System.out.println("#Tinh thanh da ton tai");
        }
    }

    public void addTidbit(int idP, Tidbit tidbit){
        int exist = chechExist(idP);
        if(exist >= 0){
            provinces.get(exist).add(tidbit);
        }else {
            System.out.println("#Tinh thanh khong ton tai");
        }
    }

    public void removeProvince(int idP){
        int exist = chechExist(idP);
        if(exist >= 0){
            System.out.println();
            System.out.println("#Tinh " + provinces.get(exist).getName() +  "da duoc xoa");
            provinces.remove(exist);
        }else {
            System.out.println("#Tinh thanh khong ton tai");
        }
    }

    public void removeTidbid(int idP, int idT){
        int exist = chechExist(idP);
        if(exist >= 0){
            System.out.println();
            System.out.println("*** Xoa mon an cua Tinh " + provinces.get(exist).getName() + " ***");
            provinces.get(exist).remove(idT);
        }else {
            System.out.println("#Tinh thanh khong ton tai");
        }
    }

    public void showTidbid(int idP){
        int exist = chechExist(idP);
        if(exist >= 0){
            System.out.println();
            System.out.println("*** Thong tin mon an cua " + provinces.get(exist).getName() + " ***");
            provinces.get(exist).showAll();
        }else {
            System.out.println("#Tinh thanh khong ton tai");
        }
    }

    public void showAll(){

    }

    public void findTidbid(int idP, String nameT){
        int exist = chechExist(idP);
        if(exist >= 0){
            System.out.println();
            System.out.println("*** Tim mon an cua " + provinces.get(exist).getName() + " ***");
            provinces.get(exist).find(nameT);
        }else {
            System.out.println("#Tinh thanh khong ton tai");
        }
    }
}
