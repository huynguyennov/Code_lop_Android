package com.nguyenhuy.bai2;

import java.util.Arrays;
import java.util.Random;

public class NumberNice {
    private int[] mangSoNguyen = new int[10];
    private Random random = new Random();

    public NumberNice(){
        for(int i = 0; i < 10; i++){
            mangSoNguyen[i] = (random.nextInt(90000) + 10000);
        }
    }

    public void inMang(){
        for(int s : mangSoNguyen){
            System.out.print(s + ", ");
        }
    }

    public void timKiem(){
        int[] counts = new int[10]; // tạo mảng counts có 10 phần tử, là phần tử đếm ứng với mỗi phần tử của mảng mangSoNguyen
        int max = 0;
        int temp;                   // khai báo temp để gán cho từng phần tử của mảng mangSoNguyen, sau dùng temp /= 10 để xét thay vì dùng
        for(int i = 0; i < 10; i++){        // phần tử mangSoNguyen chia truc tiep se bi thay doi gia tri
            counts[i] = 0;
            temp = mangSoNguyen[i];
            for(int k = 0; k <  5; k++ ){   // vòng lặp for chạy từ 0 đến 4 để xét 5 chữ số của số
                if(temp % 2 != 0){
                    counts[i]++;
                }
                temp /= 10;                 // chia số cho 10 để xét đến hàng tiếp theo
            }
            if (counts[i] > max){           // tìm phần tử trong mảng counts lớn nhất
                max = counts[i];
            }
        }
        System.out.println();
        System.out.println("Cac so co luong cac chu so le nhieu nhat");
        for(int j = 0; j < 10; j++){
            if(counts[j] == max){
                System.out.print(mangSoNguyen[j] + "\t");
            }
        }
    }

    public void timSoLon(){
        Arrays.sort(mangSoNguyen);
        System.out.println();
        for(int i = 0; i < 10; i++){
            if(mangSoNguyen[i] > 50000){
                System.out.println("3 so trong mang co gia tri lon nhat nhung khong qua 50000:");
                try {
                    System.out.println(mangSoNguyen[i - 3] + "\t" + mangSoNguyen[i - 2] + "\t" + mangSoNguyen[i - 1]);
                    System.out.println("Tong 3 so tren la: " + (mangSoNguyen[i - 3] + mangSoNguyen[i - 2] + mangSoNguyen[i - 1]));
                }catch(Exception e){
                    System.out.println("== Loi : mang khong co 3 phan tu nho hon 50000 ==");
                }
                return;
            }
        }
    }




}
