package com.nguyenhuy.kieuString.StringBuilder_StringBuffer;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello World");
        System.out.println(builder);
        System.out.println("=== append: nối 2 chuỗi vào nhau ==="); // noi 2 chuoi vao
        builder.append(", hello Viet Nam");
        System.out.println(builder.toString());

        System.out.println("=== insert: thêm chuỗi từ vị trí index ==="); // them chuoi tai 1 vi tri index
        builder.insert(2, "eell");
        System.out.println(builder.toString());

        System.out.println("=== delete: xoá chuỗi từ vị trí index1 đến trước index2 ==="); // xoa chuoi tu vi tri n den m
        builder.delete(2, 6);
        System.out.println(builder.toString());

        System.out.println("=== reverse: đảo chuỗi ==="); // đảo chuỗi
        builder.reverse();
        System.out.println(builder.toString());
    }
}
