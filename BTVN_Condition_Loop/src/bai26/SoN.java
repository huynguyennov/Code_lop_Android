package bai26;

import java.util.Scanner;

public class SoN {
    private int n;

    void nhap(){
        do{
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if(n <= 0){
                System.out.println("Nhap n khong hop le!");
            }
        }while(n <= 0);
    }

    void lietKeSoLe(){
        if(n == 1){
            System.out.println("Khong co so nguyen le nao nho hon " + n);
        }
        else {
            System.out.println("Cac so nguyen le nho hon " + n + " :");
            for (int i = 1; i < n; i += 2) {
                System.out.println(i + "\t");
            }
        }
    }
}
