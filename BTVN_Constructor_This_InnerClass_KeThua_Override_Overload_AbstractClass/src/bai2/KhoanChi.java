package bai2;

public class KhoanChi extends KhoanThuChi {

    KhoanChi(String nguoiDung, String thoiGian, String diaDiem, int soTien, String lyDo, String nguoiThuHuong) {
        super(nguoiDung, thoiGian, diaDiem, soTien, lyDo, nguoiThuHuong);
    }

    @Override
    void show() {
        System.out.println("Khoan chi: ");
        super.show();
    }
}
