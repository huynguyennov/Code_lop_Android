package bai1;

import java.util.*;

public class TongS {
    private int n;
    private int tongS;

    void nhap(){
        System.out.println("Nhap so n ( n > 3 va n < 50)");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
    }

    void kiemTraN(){
        if(n <= 3 || n >= 50){
            System.out.println("Nhap n khong hop le!");
            System.exit(0);
        }
    }

    void tinhTong(){
        tongS = 0;
        for(int i = 1; i <= n; i++){
            tongS = tongS + i;
        }
    }

    void show(){
        System.out.println("Tong S(n)= " + tongS);
    }
}
