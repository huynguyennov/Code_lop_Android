package com.nghuy.quan_ly_file;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileManager {
    private String path = "/Users/huynguyennov/T3H/Android/1810/t3h.txt";
    // tạo file
    public void management(){
        File file = new File(path);   // gan duong dan cho file
        if(file.exists()){  // kiem tra file da ton tai chua
            /*file.delete();  // xoa file*/
            String pathRename = "/Users/huynguyennov/T3H/Android/1810/b.txt";
            file.renameTo(new File(pathRename));    // doi ten file
            System.out.println("File da duoc doi ten");
        }else {
            System.out.println("File chua ton tai!");
            try {
                file.getParentFile().mkdirs(); // tao toan bo thu muc theo link neu chua ton tai
                boolean created = file.createNewFile(); // tao file
                System.out.println(created);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // lấy thông tin tất cả các file trong thư mục: tên - dung lượng - ngày
    public void readAllFile(File file){
        if(file.isFile()){  // nếu là file thì thực hiện lấy thông tin
            System.out.println("======");
            System.out.println(file.getName()); // lay ten file
            System.out.println(file.length());  // lay dung luong
            System.out.println(file.lastModified());
            //format time - cach chuyen thoi day so kieu long thanh dinh dang time
            // có nhiều kiểu format time, lên google tham khảo. Chi viec thay vao pattern
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm aaa");
            // chuyen doi thanh dinh dang thoi gian format ngay/thang/nam/gio/phut
            Date date = new Date(file.lastModified());  // chuyen doi
            String lastModified = format.format(date);
            System.out.println(lastModified); // tra ve thoi gian chinh sua cuoi cung
            return;
        }
        for (File f : file.listFiles()){    // không thuộc if ở trên thì là thư mục, lấy danh sách file trong thư mục và đệ quy với file
            readAllFile(f);     // đệ quy phương thức readAllfile cho đến khi nào tận cùng folder
        }
    }

    // ghi file text
    public void write(String s){
        try {
            File file = new File(path);
            if (file.exists() == false){
                file.getParentFile().mkdirs();  // lai tao thu muc theo duong dan neu chua co
                file.createNewFile();   // neu file da co roi van ghi de len
            }
            FileOutputStream outputStream = new FileOutputStream(file, true);   // true là để nếu ghi lại thì cho phép ghi tiep cuối  hay la khong : co ghi tiep. nguoc lai vs false thì sẽ ghi lại từ đầu
            outputStream.write(s.getBytes());   // s.getBytes > đưa dữ liệu muốn ghi thành Byte và ghi vào file
            System.out.println("Da ghi du lieu");
            outputStream.close();   // dong luong xu ly nay
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    // doc file
    public void read(){
        File file = new File(path);
        if(file.exists() == false){
            System.out.println("File khong ton tai!");
            return;
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] b = new byte[1024];  // tao ra mang byte[] b chua du lieu can doc, moi lan doc duoc toi da 1024 byte
            int count = fileInputStream.read(b);    // dữ liệu đọc sẽ truyền vào b với số byte có giá trị, nếu có dữ liệu để đọc thì
                                                    // count sẽ được truyền vào số lượng byte có giá trị đọc được (VD: lần cuối đọc
                                                    // được 598byte thì count = 598 , không còn byte để đọc thì truyền -1 // tìm hiểu các loại phương thức read()
            StringBuilder builder = new StringBuilder();
            while (count != -1){    // khi ma khong con du lieu trong file de doc thi se tra ve cho count la -1
                String s = new String(b, 0, count); // chuyen byte[] thanh dang text tu 0 den count - luong byte doc duoc
                builder.append(s);      // truyền dần dần dữ liệu đọc được vào builder, theo các lần đọc cho đến khi count = -1
                count = fileInputStream.read(b);    // truyền lại vào count mỗi lần ghi vào
            }
            fileInputStream.close();    // dong luong lai
            System.out.println(builder);
        }catch (Exception ex){
        }
    }

    public void downloadFile(String link, String fileName){  // tai file tu internet: link download va dat ten cho file tai ve
        try {
            File file = new File("/Users/huynguyennov/T3H/Android/1810/" + fileName);
            file.getParentFile().mkdirs();
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file, false); // false là để nếu ghi lại thì sẽ ghi lại từ đầu chứ không ghi tiếp vào file - nếu ghi tiếp file sẽ bị lỗi
            // file source
            URL url = new URL(link);    // dung URL cua java.net
            URLConnection connection = url.openConnection(); // connection biểu trưng cho file theo link cần tải
            // tinh phan tram da tai
            long total = connection.getContentLengthLong(); // total = dung luong cua file tai ve ( connection.getContentLengLong() trả về dung lượng file cần tải
            InputStream inputStream = connection.getInputStream();  // mở luồng vào để đọc file theo link trên Socket tại Sever
            // ghi file đọc được vào file loc - tương tự với ghi file ở trên
            long totalSaved = 0;
            byte[] b = new byte[2048];
            int count = inputStream.read(b);
            while (count != -1){
                fileOutputStream.write(b, 0, count);
                totalSaved += count;
                int percent = (int) (totalSaved * 100 / total);
                System.out.println(percent);
                count = inputStream.read(b);

            }
            inputStream.close();
            fileOutputStream.close();
            System.out.println("Da download");
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
