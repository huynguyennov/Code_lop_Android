package bai5;

import java.util.Scanner;

public class TongS {
    private int n;
    private float tongS;

    void nhap(){
        do {
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if (n < 2) {
                System.out.println("Nhap n khong hop le!");
            }
        }while(n < 2);
    }

    void tinhTongS(){
        tongS = 1;
        for(int i = 1; i <= n; i++){
            tongS = tongS + (1 / (float)((2 * i) + 1));
        }
    }

    void show(){
        System.out.println("Tong S(n)= " + tongS);
    }
}
