package bai10;

import java.util.Scanner;

public class TinhT {
    private float x;
    private float n;
    private double T;

    void nhap(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Nhap x: ");
            x = scan.nextFloat();
            System.out.println("Nhap n: ");
            n = scan.nextFloat();
    }

    void tinhT(){
        T = Math.pow(x,n);
    }

    void show(){
        System.out.println("T(x,n)= " + T);
    }
}
