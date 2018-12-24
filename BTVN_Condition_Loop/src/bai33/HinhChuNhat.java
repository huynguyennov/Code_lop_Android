package bai33;

import java.util.Scanner;

public class HinhChuNhat {
    private int m;
    private int n;

    void nhap(){
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Nhap m: ");
            m = scan.nextInt();
            System.out.println("Nhap n: ");
            n = scan.nextInt();
            if(m <= 0 || n <= 0){
                System.out.println("Nhap m va n khong hop le!");
            }
        }while(m <= 0 || n <= 0);
    }

    void veHinhChuNhat(){
        for(int i = 1; i <= m; i++){
            if (i != 1 && i != m) {
                for (int k = 1; k <= n; k++) {
                    if(k == 1 || k == n){
                        System.out.print("*   ");
                    }
                    else{
                        System.out.print("    ");
                    }
                }
            } else {
                for(int l = 1; l <= n; l++){
                    System.out.print("*   ");
                }
            }
            System.out.println("\n");
        }
    }
}
