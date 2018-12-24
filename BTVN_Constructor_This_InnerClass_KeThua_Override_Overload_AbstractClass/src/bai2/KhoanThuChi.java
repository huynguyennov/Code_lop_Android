package bai2;

public class KhoanThuChi extends KhoanTien {
    protected String nguoiThuHuong;


    KhoanThuChi(String nguoiDung, String thoiGian, String diaDiem, int soTien, String lyDo, String nguoiThuHuong) {
        super(nguoiDung, thoiGian, diaDiem, soTien, lyDo);
        this.nguoiThuHuong = nguoiThuHuong;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Nguoi thu huong: " + nguoiThuHuong);
    }
}
