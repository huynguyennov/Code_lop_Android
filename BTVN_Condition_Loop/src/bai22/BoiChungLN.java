package bai22;

import java.util.Scanner;

public class BoiChungLN {
    private int n;
    private int m;
    private int ucln;
    private int bcnn;

    void nhap(){
        do {
            System.out.println("Nhap so n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            System.out.println("Nhap so m");
            m = scan.nextInt();
            if (n <= 0 || m <= 0) {
                System.out.println("Nhap n, m khong hop le!");
            }
        } while (n <= 0 || m <= 0);
    }

    void timBCLN(){
        int n2 = n;
        int m2 = m;
        if(n2 == 0 || m2 == 0){
            ucln = n2 + m2;
        }
        else{
            while( n2 != m2){
                if(n2 > m2){
                    n2 = n2 - m2;
                }
                else{
                    m2 = m2 - n2;
                }
            }
            ucln = n2;
        }
        bcnn = (n * m) / ucln;
    }

    void show(){
        System.out.println("Boi chung nho nhat cua " + n + " va " + m + " la: " + bcnn);
    }
}
