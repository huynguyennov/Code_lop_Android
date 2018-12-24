package com.nguyenhuy.bai2;

public class MyPrime {

    public MyPrime() {
    }

    public boolean kiemTraSNT(int soKt) {
        if (soKt < 2){
            return false;
        }
        if (soKt > 2){
            if (soKt % 2 == 0){
                return false;
            }else {
                for(int i = 3; i <= Math.sqrt(soKt); i += 2){
                    if(soKt % i == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public String lietKe(int n) {
        String s = "So N: " + n + "\n" + "Cac SNT nho hon " + n + " :\n";
        int count = 0;
        if(n < 2){
            return s;
        }else {
            for(int i = 2; i < n; i++ ){
                if(kiemTraSNT(i)){
                    s += i + " , ";
                    count++;
                    if(count % 10 == 0){
                        s += "\n";
                    }
                }
            }
            return s;
        }
    }

}
