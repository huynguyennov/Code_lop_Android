package bai2;

import java.util.Scanner;

public class TongS {
    private int n;
    private int tongS;

    void nhap(){
        System.out.println("Nhap so n (n >= 5 va n <= 20)");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
    }

    void kiemTraN(){
        if(n < 5 || n > 20){
            System.out.println("n nhap vao khong hop le!");
            System.exit(0);
        }
    }

    void tinhTongS(){
        tongS = 0;
        for(int i = 1; i <= n; i++){
            tongS = tongS + (i * i);
        }
    }

    void show(){
        System.out.println("Tong S(n) = " + tongS);
    }
}
