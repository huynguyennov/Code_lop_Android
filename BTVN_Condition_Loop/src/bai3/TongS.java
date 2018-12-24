package bai3;

import java.util.Scanner;

public class TongS {
    private int n;
    private float tongS;

    void nhap(){
        System.out.println("Nhap so n (n >= 7)");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
    }

    void kiemTraN(){
        if(n < 7){
            System.out.println("n nhap vao khong hop le!");
            System.exit(0);
        }
    }

    void tinhTongS(){
        tongS = 0;
        for(int i = 1; i <= n; i++){
            tongS = tongS + (1 / (float)i);
        }
    }

    void show(){
        System.out.println("Tong S(n) = " + tongS);
    }
}
