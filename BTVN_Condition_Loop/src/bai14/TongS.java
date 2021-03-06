package bai14;

import java.util.Scanner;

public class TongS {
    private float x;
    private float n;
    private double tongS;

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap x: ");
        x = scan.nextFloat();
        System.out.println("Nhap n: ");
        n = scan.nextFloat();
    }

    void tinhTongS(){
        tongS = x;
        for(int i = 1; i <= n; i++){
            tongS = tongS + Math.pow(x, (2 * i + 1));
        }
    }

    void show(){
        System.out.println("S(n) = " + tongS);
    }
}
