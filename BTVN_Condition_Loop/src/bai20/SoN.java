package bai20;

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

    boolean kiemTraSoCP(int nIn){
        if((float)Math.sqrt(n) % 1F == 0){
            return true;
        }
        return false;
    }

    void show(){
        if(kiemTraSoCP(n)){
            System.out.println(n + " la so chinh phuong!");
        }
        else{
            System.out.println(n + " khong la so chinh phuong!");
        }
    }
}
