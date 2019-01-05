package com.nguyenhuy.manager;

import com.nguyenhuy.model.MapBoom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MapManager {
    private ArrayList<MapBoom> arrMap;
    private final int SIZE = 40;

    // Về nghiên cứu lại phần này
    public void readMap(String name){   // Đọc map từ file txt
        try {
            arrMap = new ArrayList<MapBoom>();
            File f = new File("src/map/" + name);   // Đọc file theo địa chỉ
            FileReader fileReader = new FileReader(f);
            BufferedReader reader = new BufferedReader(fileReader); //
            String line = reader.readLine(); // Đọc theo từng dòng
            // Duyệt mảng 2 chiều [i], [j]
            int i = 0;
            while (line!= null){    // khi mà dòng đọc không trống
                for (int j = 0; j < line.length(); j++){    //  Trong mảng 2 chiều i, j
                    int x = j * SIZE;   // toạ độ x bằng vị trí cột của mảng 2 chiều nhân với kích thước ảnh
                    int y = i * SIZE;   // toạ độ y bằng vị trí dòng của mảng 2 chiều nhân với kích thước ảnh
                    // Nghiên cứu về toạ độ này
                    int bit = Integer.parseInt(line.charAt(j) + "");
                    arrMap.add(new MapBoom(x, y, bit));

                }
                i++; // Tăng dòng của mảng
                line = reader.readLine(); // gán lại cho dòng mới
            }
            reader.close();
            fileReader.close();
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }

    public ArrayList<MapBoom> getArrMap() {
        return arrMap;
    }
}
