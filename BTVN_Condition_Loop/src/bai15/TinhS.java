package bai15;

import java.util.Scanner;

public class TinhS {
    private float n;
    private double S;

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scan.nextFloat();
    }

    void tinhS(){
        S = 1;
        for(int i = 2; i <= n; i++){
            S = S * i;
        }
    }

    void show(){
        System.out.println("S(n) = " + S);
    }
}
