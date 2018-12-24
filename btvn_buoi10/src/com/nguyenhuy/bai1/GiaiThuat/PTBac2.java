package com.nguyenhuy.bai1.GiaiThuat;

public class PTBac2 {
    private int a;
    private int b;
    private int c;

    public PTBac2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String giaiPT(){
        if (a == 0) {
            return "He so a phai khac 0";
        }else {
        int delta = a * b - 4 * a * c;
            if(delta < 0){
                return "Phuong trinh vo nghiem!";
            }
            else if(delta == 0){
                return ("x1 = x2 = " + (float)(-b) / (2 * a));
            }
            else{
                return ("x1 = " + ((float)(-b + Math.sqrt((float)delta)) / (2 * a)) + ", x2 = " + ((float)(-b - Math.sqrt((float)delta)) / (2 * a)));
            }
        }
    }
}
