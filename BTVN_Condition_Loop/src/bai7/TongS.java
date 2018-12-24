package bai7;

import java.util.Scanner;

public class TongS {
    private int n;
    private double tongS;

    void nhap(){
        do {
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if (n < 1) {
                System.out.println("Nhap n khong hop le!");
            }
        }while(n < 1);
    }

    void tinhTongS(){
        tongS = 0;
        for(int i = 1; i <= n; i++){
            tongS = tongS + ((double)i / (double)(i + 1));
        }
    }

    void show(){
        System.out.println("Tong S(n)= " + tongS);
    }
}
