package bai11;

import java.util.Scanner;

public class TongS {
    private int n;
    private long tongS;
    private long giaiThua;

    void nhap(){
        System.out.println("Nhap so n");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
    }

    void tinhTongS(){
        tongS = 0;
        giaiThua = 1;
        for(int i = 1; i <= n; i++){
            giaiThua = giaiThua * i;
            tongS = tongS + giaiThua;
        }
    }

    void show(){
        System.out.println("S(n) = " + tongS);
    }
}
