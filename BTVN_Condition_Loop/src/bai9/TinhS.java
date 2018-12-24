package bai9;

import java.util.Scanner;

public class TinhS {
    private int n;
    private long tongS;

    void nhap(){
        do {
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if (n <= 6) {
                System.out.println("Nhap n khong hop le!\n");
            }
        }while(n <= 6);
    }

    void tinhTongS(){
        tongS = 1;
        for(int i = 2; i <= n; i++){
            tongS = tongS * i;
        }
    }

    void show(){
        System.out.println("S(n)= " + tongS);
    }
}
