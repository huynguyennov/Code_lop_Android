package bai18;

import java.util.Scanner;

public class SoN {
    private int n;
    private int count;
    private int le;
    private int chan;

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

    void dem(){
        count = 0;
        le = 0;
        chan = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
                if(i % 2 == 0){
                    chan++;
                }
                else{
                    le++;
                }
            }
        }
    }

    void show(){
        System.out.println(n + " co " + count + " uoc so");
        System.out.println("Trong do co " + chan + " uoc so chan va " +
                le + " uoc so le");
    }
}
