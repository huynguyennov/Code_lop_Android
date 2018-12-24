package bai27;

import java.util.Scanner;

public class SoN {
    private int n;

    void nhap(){
        do{
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if(n < 0){
                System.out.println("Nhap n khong hop le!");
            }
        }while(n < 0);
    }

    void lietKeSoLe(){
        if(n ==0 || n == 1){
            System.out.println("Khong co so nguyen le nao nho hon " + n);
        }
        else {
            System.out.println("Cac so nguyen le nho hon " + n + " va khac 7,21,41 :");
            for (int i = 1; i < n; i += 2) {
                if(i != 7 && i != 21 && i!= 41) {
                    System.out.println(i + "\t");
                }
            }
        }
    }
}
