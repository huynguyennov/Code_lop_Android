package bai19;

import java.util.Scanner;

public class SoN {
    private int n;

    void nhap() {
        do {
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if (n <= 0) {
                System.out.println("Nhap n khong hop le!");
            }
        } while (n <= 0);
    }

    boolean kiemTraSoNT(int nIn){
        if(n < 2){
            return false;
        }
        if(n > 2){
            if(n % 2 == 0){
                return false;
            }
            else{
                for(int i = 3; i <= Math.sqrt(n); i += 2){
                    if(n % i == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    void show(){
        if(kiemTraSoNT(n)){
            System.out.println(n + " la so nguyen to");
        }
        else{
            System.out.println(n + " khong la so nguyen to");
        }
    }
}
