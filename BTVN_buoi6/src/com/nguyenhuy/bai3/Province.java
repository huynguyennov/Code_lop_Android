package com.nguyenhuy.bai3;

import java.util.ArrayList;

public class Province {
    private int id;
    private String name;
    private ArrayList<Tidbit> tidbits;

    public Province(int id, String name) {
        this.id = id;
        this.name = name;
        tidbits = new ArrayList<Tidbit>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int checkExistID(int id){
        for(int i = 0; i < tidbits.size(); i++){
            if(this.tidbits.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    private int checkExistName(String name){
        for(int i = 0; i < tidbits.size(); i++){
            if(this.tidbits.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void add(Tidbit tidbit){
        int exist = checkExistID(tidbit.getId());
        if(exist == -1){
            tidbits.add(tidbit);
            System.out.println("#Da them mon an");
        }else{
            System.out.println("#Mon an da ton tai");
        }

    }

    public void find(String name){
        int exist = checkExistName(name);
        if(exist >= 0){
            System.out.println("#Thong tin cac mon an co ten " + name);
            for(Tidbit t : tidbits){
                if(t.getName().equals(name)){
                    t.show();
                }
            }
        }else {
            System.out.println("#Khong tim thay mon an");
        }
    }

    public void remove(Integer id){
        int exist = checkExistID(id);
        if(exist >= 0){
            System.out.println("#Mon an " + tidbits.get(exist).getName() + " da duoc xoa");
            tidbits.remove(exist);
        }else {
            System.out.println("#Mon an khong ton tai");
        }
    }

    public void showAll(){
        for(Tidbit t : tidbits){
            System.out.println("=====");
            t.show();
        }
    }

}
