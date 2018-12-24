package com.nguyenhuy.kieuString.String;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== length ===");   // do dai cua chuoi str
        String str = "Hello World";
        int length = str.length();
        System.out.println(length);

        System.out.println("=== charAt ==="); // trả về ký tự ở vị trí index
        char c = str.charAt(2);
        System.out.println(c);

        System.out.println("=== indexOf ===");  // trả về vị trí đầu tiên có chuỗi "l" trong chuỗi str
        int index = str.indexOf("l");
        System.out.println(index);

        System.out.println("=== lastIndexOf ===");  // trả về vị trí cuối cùng của chuỗi "l" trong chuỗi str
        int lastIndexOf = str.lastIndexOf("l");
        System.out.println(lastIndexOf);

        System.out.println("=== indexOf có 2 tham số ==="); // trả về vị trí có chuỗi "l", tìm từ vị trí (index +1)
        int secondIndex = str.indexOf("l", index + 1);
        System.out.println(secondIndex);

        System.out.println("=== Tìm tất cả vị trị có \"l\" ===");   // tim cac vi tri co ky tu 'l'
        System.out.println("Cac vi tri co ky tu \'l\'");
        for(int i = 0; i < str.length(); i++){
            char check = str.charAt(i);
            if(check == 'l'){
                System.out.println(i + "\t");
            }
        }

        // tim cac vi tri co ky tu 'l' voi it vong lap (3 ky tu 'l' thi chi co 3 vong lap)
        System.out.println("=== Tìm tất cả vị trị có \"l\" ===");
        int index1 = str.indexOf("l");      // indexOf sẽ chạy từ trái sang phải để kiểm tra, khi kiểm tra chuỗi không phải thì sẽ trả về -1
        while(index1 != -1){
            System.out.println(index1 + "\t");  //
            index1 = str.indexOf("l", index1 + 1); // nếu không tìm thấy 'l' sẽ trả về -1,
            // khi đó vòng lặp không thực hiện => tiết kiệm vòng lặp
        }


        System.out.println("=== substring ===");    // Cắt chuỗi
        System.out.println(str);
        System.out.println("=== substring 1 tham so");
        String str1 = str.substring(2); // substring 1 tham số => cắt chuỗi str bắt đầu từ vị trí index
        System.out.println(str1);
        System.out.println("=== substring 2 tham so ===");
        str1 = str.substring(2, 7); // substring 2 tham so => cắt chuỗi bắt đầu từ index1 đến trước index2
        System.out.println(str1);


        System.out.println("=== toUpperCase & toLowerCase");    // Viết hoa và viết thường toàn bộ chuỗi
        System.out.println("# toUpperCase");
        str = str.toUpperCase();    // đều phải gán cho 1 chuỗi vì chứ không thể tự str.toUpperCase sẽ không có gì xảy
        System.out.println(str);
        System.out.println("# toLowerCase");
        str = str.toLowerCase();
        System.out.println(str);

        System.out.println("=== replace & replaceFirst ===");
        str1 = str.replaceFirst("l", "L"); // replaceFirst => thay the ky tu 'l' dau tien
        System.out.println(str1);
        str1 = str.replace("l", "L"); // replace => thay the toan bo ky tu 'l'
        System.out.println(str1);


        System.out.println("=== Cách tự động viết hoa toàn bộ ký tự sau dấu cách ===");
        Main main = new Main();
        main.upperCase("nguyen van huy");


        System.out.println("=== equals ===");   // so sánh 2 chuỗi theo dạng ký tự giống nhau không
        String str2 = str;
        boolean equals = str.equals(str2);
        System.out.println(equals);
        System.out.println("# So sánh chữ thường với chữ hoa sẽ trả về false");
        str2 = str2.toUpperCase();
        equals = str.equals(str2);
        System.out.println(equals);
        System.out.println("# So sánh 2 chuỗi sử dụng equalsIgnoreCase để bỏ qua chữ Hoa => true");
        equals = str.equalsIgnoreCase(str2);
        System.out.println(equals);

        System.out.println("=== codePointAt ===");  // Lay so ascii tuong ung voi ky tu
        str1 = str.toUpperCase();
        System.out.println(str1);
        int ascii = str1.codePointAt(0);
        System.out.println(ascii);
        System.out.println((char)ascii);            // lại ép kiểu char để in ra ký tự

        System.out.println("=== compareTo(): so sánh hơn kém ===");
        String s1 = "abc";
        String s2 = "bbc";
        int compare = s1.compareTo(s2); // so sanh 2 chuoi, so sanh tung ky tu tu trai sang phai
                                        // bang ma ascii cua moi ky tu tru cho nhau
        System.out.println(compare);

        System.out.println("=== trim(): cắt toàn bộ khoảng trắng trong chuỗi ==="); // trim: cat toan bo khoang trang
        String s3 = "    hello world & Hello Vietnam         ";
        System.out.println(s3);
        s3 = s3.trim();
        System.out.println("Sau khi trim:");
        System.out.println(s3);

        System.out.println("=== split() ===");    // cat chuoi thanh tung phan nho, bo dau cach
                                                // ap dung cho doi chieu tai khoan voi du lieu
        System.out.println("Truoc:" + str);
        String[] arr = str.split(" ");
        for(String s : arr){
            System.out.println(s);
        }

        System.out.println("=== toCharArray() ==="); // tra ve cac ky tu cua chuoi nay
        char[] chars = str.toCharArray();
        for(char kt : chars){
            System.out.println(kt);
        }

        System.out.println("=== getBytes() ===");   // trả về mảng byte của chuỗi
        byte[] bytes = str.getBytes();
        for(byte d : bytes){
            System.out.println(d);
        }

    }


    // viet hoa cac tu sau dau cach VD: Hello World tu hello world
    private void upperCase(String str){
        System.out.println("# Chuoi ban dau: " + str);

        System.out.println("# Viet hoa chu cai dau tien trong chuoi");
        String sF = str.substring(0, 1);
        String sF1 = sF.toUpperCase();
        str = str.replaceFirst(sF, sF1);
        System.out.println(str);

        System.out.println("# Viết hoa chữ cái sau mỗi dấu cách");
        int index = str.indexOf(" ");
        while (index != -1){
            String s = str.substring(index, index +2); // cat chuoi tu vi tri khoang cach den ky tu sau cua khoang cach
            String s1 = s.toUpperCase();    // viet hoa toan bo chuoi s
            str = str.replace(s, s1);       // thay thế cụm ký tự s trong chuỗi str bằng cụm ký tự s1
            index = str.indexOf(" ", index + 1);
        }
        System.out.println(str);
    }
}
