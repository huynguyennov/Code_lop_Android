package bai8;

import java.util.Scanner;

public class TongS {
    private int n;
    private double tongS;

    void nhap(){
        do {
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if (n <= 5) {
                System.out.println("Nhap n khong hop le!");
            }
        }while(n <= 5);
    }

    void tinhTongS(){
        tongS = (1/2);
        for(int i = 1; i <= n; i++){
            tongS = tongS + ((double)(2 * i + 1) / (double)(2 * i + 2));
        }
    }

    void show(){
        System.out.println("Tong S(n)= " + tongS);
    }
}
