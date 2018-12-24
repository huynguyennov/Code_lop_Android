package bai2;

public class KhoanVay extends KhoanVayChoVay {

    KhoanVay(String nguoiDung, String thoiGian, String diaDiem, int soTien, String lyDo, String nguoiVayChoVay, int thoiHan, int laiSuat, String ngayTra, String xacNhanTra) {
        super(nguoiDung, thoiGian, diaDiem, soTien, lyDo, nguoiVayChoVay, thoiHan, laiSuat, ngayTra, xacNhanTra);
    }

    @Override
    void show() {
        System.out.println("Khoan vay: ");
        super.show();
        System.out.println("Nguoi cho vay: " + nguoiVayChoVay);
    }
}
