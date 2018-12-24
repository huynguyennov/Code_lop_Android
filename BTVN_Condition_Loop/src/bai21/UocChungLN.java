package bai21;

import java.util.Scanner;

public class UocChungLN {
    private float n;
    private float m;
    private float ucln;

    void nhap() {
        do {
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextFloat();
            System.out.println("Nhap so m");
            m = scan.nextFloat();
            if (n <= 0 || m <= 0) {
                System.out.println("Nhap n, m khong hop le!");
            }
        } while (n <= 0 || m <= 0);
    }

    void timUCLN(){
        float n2 = n;
        float m2 = m;
        if(n2 == 0 || m2 == 0){
            ucln = m2 + n2;
        }
        while(n2 != m2){
            if(n2 > m2){
                n2 = n2 - m2;
            }
            else{
                m2 = m2 - n2;
            }
        }
        ucln = n2;
    }

    void show(){
        System.out.println("Uoc chung lon nhat cua " + n + " va " + m + " la: " + ucln);
    }

}
