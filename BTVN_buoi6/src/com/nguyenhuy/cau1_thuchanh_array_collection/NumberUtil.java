package com.nguyenhuy.cau1_thuchanh_array_collection;

public class NumberUtil {
    private int value;
    private int type;

    public NumberUtil(int value) {
        this.value = value;
        this.type = -1;
    }

    public boolean checkPerfectNumber() {
        int tongUoc = 0;
        for(int i = 1; i <= value; i++){
            if(value % i == 0) {
                tongUoc += i;
            }
        }
        if(value == (tongUoc / 2)){
            return true;
        }else {
            return false;
        }
    }

    public boolean checkSymmetryNumber(){
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(value));
        String reverseNum = stringBuilder.reverse().toString();
        if(value == Integer.parseInt(reverseNum)) {
            return true;
        }else {
            return false;
        }
    }

    public void printNum() {
        String ketQua = Integer.toString(value);
        if(checkPerfectNumber()){
            ketQua += " - Hoan hao";
        }
        if(checkSymmetryNumber()){
            ketQua += " - Doi xuong";
        }
        System.out.println(ketQua);
    }



}
