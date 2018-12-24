package bai17;

import java.util.Scanner;

public class SoN {
    private int n;
    private int tong;
    private long tich;

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

    void tinhTongTich(){
        tong = 0;
        tich = 1;
        System.out.print("Cac uoc so cua " + n + " la: ");
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                tong = tong + i;
                tich = tich * i;
            }
        }
    }

    void show(){
        System.out.println("\nTong cac uoc so cua " + n + " la: " + tong);
        System.out.println("Tich cac uoc so cua " + n + " la: " + tich);
    }
}
