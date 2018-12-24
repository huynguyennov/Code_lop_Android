package com.nghuy.quan_ly_file;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.management();
        //fileManager.readAllFile(new File("/Users/huynguyennov/T3H/Android/1810/b.txt"));
        //fileManager.readAllFile(new File("/Users/huynguyennov/Google Drive"));  // dung try catch toan bo phuong thuc readAllFile de doc duoc o quan trong (VD: ổ C ở Window)
                                                                                          // (bo qua nhung file quan trong khong co quyen truy cap)
/*        fileManager.write("Hello World!\n");
        fileManager.read();*/
/*        String link = "https://mcloud-bf-s7-mv-zmp3.zadn.vn/MHRxjUeUwFs/0d56d76b7f2f9671cf3e/" +
                "d5be07632b26c2789b37/360/24H.mp4?authen=exp=1544535057~acl=/MHRxjUeUwFs/*~hmac=b2f78414807f15885892bcf843845c37";
        fileManager.downloadFile( link, "24H.mp4");*/
    }
}
