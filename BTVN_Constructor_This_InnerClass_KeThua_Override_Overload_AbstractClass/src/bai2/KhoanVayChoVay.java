package bai2;

public class KhoanVayChoVay extends KhoanTien {
    protected String nguoiVayChoVay;
    protected int thoiHan;
    protected int laiSuat;
    protected String ngayTra;
    protected String xacNhanTra;

    KhoanVayChoVay(String nguoiDung, String thoiGian, String diaDiem, int soTien, String lyDo, String nguoiVayChoVay, int thoiHan, int laiSuat, String ngayTra, String xacNhanTra) {
        super(nguoiDung, thoiGian, diaDiem, soTien, lyDo);
        this.nguoiVayChoVay = nguoiVayChoVay;
        this.thoiHan = thoiHan;
        this.laiSuat = laiSuat;
        this.ngayTra = ngayTra;
        this.xacNhanTra = xacNhanTra;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Thoi han: " + thoiHan);
        System.out.println("Lai suat: " + laiSuat);
        System.out.println("Ngay tra: " + ngayTra);
        System.out.println("Xac nhan tra: " + xacNhanTra);
    }
}
