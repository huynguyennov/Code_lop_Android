package bai30;

import java.util.Scanner;

public class VeTamGiac {
    private int h;

    void nhap(){
        do {
            System.out.println("Nhap do cao h: ");
            Scanner scan = new Scanner(System.in);
            h = scan.nextInt();
            if(h <= 0){
                System.out.println("Nhap h khong hop le!");
            }
        }while(h <= 0);
    }

    void veTamGiac(){
        for(int i = 1; i <= h; i++){
            for(int k = 1; k <= i; k++){
                System.out.print("*   ");    // bỏ ln trong print đi để không xuống dòng
            }
            System.out.println("\n");
        }
    }
}
