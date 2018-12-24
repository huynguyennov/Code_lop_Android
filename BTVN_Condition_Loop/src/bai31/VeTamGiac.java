package bai31;

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
            if(i != h) {
                for (int k = 1; k <= i; k++) {
                    if (k == 1 || k == i) {
                        System.out.print("*   ");    // bỏ ln trong print đi để không xuống dòng
                    } else {
                        System.out.print("    ");
                    }
                }
            }
            else{
                for(int n = 1; n <= i; n++){
                    System.out.print("*   ");
                }
            }
            System.out.println("\n");
        }
    }
}
