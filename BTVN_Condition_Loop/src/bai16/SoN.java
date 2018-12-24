package bai16;

import java.util.Scanner;

public class SoN {
    private int n;

    void nhap() {
        do {
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if(n <= 0){
                System.out.println("Nhap n khong hop le!");
            }
        }while(n <= 0);
    }

    void timUoc(){
        System.out.println("Cac uoc so cua " + n + " :");
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i + "\t");
            }
        }
    }
}
