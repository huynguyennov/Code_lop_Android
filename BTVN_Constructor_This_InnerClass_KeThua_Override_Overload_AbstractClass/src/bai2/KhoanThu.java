package bai2;

public class KhoanThu extends KhoanThuChi {

    KhoanThu(String nguoiDung, String thoiGian, String diaDiem, int soTien, String lyDo, String nguoiThuHuong) {
        super(nguoiDung, thoiGian, diaDiem, soTien, lyDo, nguoiThuHuong);
    }

    @Override
    void show() {
        System.out.println("Khoan thu: ");
        super.show();
    }
}
