package com.nguyenhuy.cau1_thuchanh_array_collection;

public class Main {
    public static void main(String[] args) {
        NumberUtil numberUtil = new NumberUtil(6);
        if(numberUtil.checkPerfectNumber()){
            System.out.println("So hoan hao");
        }
        if(numberUtil.checkSymmetryNumber()){
            System.out.println("So doi xung");
        }
    }
}
