package com.nguyenhuy.mang;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MangTinh {
    // <KDL>[] <tenMang> = new <KDL>[<so phan tu>]
    private Integer[] arr;                          // kieu doi tuong cua int, wrapper
    private Random random = new Random();

    public MangTinh(int size){
        arr = new Integer[size];
        for(int k = 0; k < arr.length; k++){
            arr[k] = (random.nextInt(91) + 10);
        }
    }

    public void inMang(){
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public void sapXepTang(){
        Arrays.sort(arr);           // tim hieu lai Arrays.sort
    }

    public void sapXepGiam(){
        Arrays.sort(arr,comparator);
    }

    private Comparator<Integer> comparator = new Comparator<Integer>() {    //
        @Override
        public int compare(Integer o1, Integer o2) {        // o1: vi tri hien tai, o2: vi tri ngay sat => so sanh 2 thang o1 - o2
            if(o1 > o2){
                return -1;              // neu o1 > o2 => tra ve gia tri am va nguoc lai
            }
            return 1;
        }
    };

}
