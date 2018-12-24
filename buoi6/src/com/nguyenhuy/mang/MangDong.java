package com.nguyenhuy.mang;

import java.util.ArrayList;
import java.util.Collections;

public class MangDong {
    private ArrayList<Integer> arr = new ArrayList<>();

    public void add(Integer value){
        arr.add(value);
    }

    public void add(int index, Integer value){
        arr.add(index, value);
    }

    public void addAll(ArrayList<Integer> arrExtention){
        arr.addAll(arrExtention);
    }

    public void addAll(int index, ArrayList<Integer> arrExtention){
        arr.addAll(index, arrExtention);
    }

    public void set(int index, Integer value){
        arr.set(index, value);
    }

    public void remove(int index){
        arr.remove(index);
    }

    public void clear(){
        arr.clear();
    }

    public int indexOf(Integer value){
        return arr.indexOf(value);
    }

    public boolean checkContainAll(ArrayList<Integer> arr){
        return this.arr.containsAll(arr);                  // kiem tra mang nay co chua mang con arr khong
    }

    public void sort(){
        Collections.shuffle(arr);                          // đảo lộn các phần tử của mảng
    }

    public void inMang(){
        System.out.println();
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + "\t");
        }
    }
}
