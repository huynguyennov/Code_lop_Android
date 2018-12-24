package bai4;

import java.util.Scanner;

public class TongS {
    private int n;
    private float tongS;

    void nhap(){
        do {
            System.out.println("Nhap so n ( n > 9): ");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if(n <= 9){
                System.out.println("Nhap n khong hop le! \n");
            }
        }while(n <= 9);
    }

    void tinhTongS(){
        tongS = 0;
        for(int i = 1; i <= n; i++){
            tongS = tongS + (1 / (2 * (float)i));
        }
    }

    void show(){
        System.out.println("Tong S(n)= " + tongS);
    }
}
