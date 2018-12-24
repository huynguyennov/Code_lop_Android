package bai29;

import java.util.Scanner;

public class TamGiacCan {
    private int h;

    void nhap(){
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Nhap h: ");
            h = scan.nextInt();
            if(h <= 0){
                System.out.println("Nhap h khong hop le!");
            }
        }while(h <= 0);
    }

    void veTamGiacCan(){
        for(int i = 1; i <= h; i++){
            for(int k = i; k <= (h - 1); k++){
                System.out.print("   ");
            }
            if(i != 1 && i != h) {
                for (int l = 1; l <= i; l++) {
                    if (l == 1 || l == i) {
                        System.out.print("*     ");
                    } else {
                        System.out.print("      ");
                    }
                }
            }
            else{
                for(int m = 1; m <= i; m++){
                    System.out.print("*     ");
                }
            }
            System.out.println("\n");
        }
    }
}
