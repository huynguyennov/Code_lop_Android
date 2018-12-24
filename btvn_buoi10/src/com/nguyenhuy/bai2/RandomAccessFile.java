package com.nguyenhuy.bai2;

import java.io.File;
import java.io.FileOutputStream;

public class RandomAccessFile {
    private String path = "/Users/huynguyennov/btvn_buoi10/soNT.txt";

    public RandomAccessFile() {
        try {
            File file = new File(path);
            if(file.exists() == false){
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }

    }

    public void write(String s){
        try {
            File file = new File(path);
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            s += "\n===========\n";
            fileOutputStream.write(s.getBytes());
            System.out.println("Da luu cac so nguyen to vao file");
            fileOutputStream.close();
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
