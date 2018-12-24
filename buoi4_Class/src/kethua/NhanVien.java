package kethua;

public class NhanVien extends ConNguoi {
    String maNV;
    String phongBan;
    int luong;

    public NhanVien(String ten, int tuoi, String diaChi, boolean gioiTinh, String soDienThoai,
                    String maNV, String phongBan, int luong) {
        super(ten, tuoi, diaChi, gioiTinh, soDienThoai);
        this.maNV = maNV;
        this.phongBan = phongBan;
        this.luong = luong;
    }

    public NhanVien(String ten, int tuoi, String diaChi, boolean gioiTinh, String soDienThoai,
                    String maNV) {
        super(ten, tuoi, diaChi, gioiTinh, soDienThoai);
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.maNV = maNV;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
    }   // ví dụ overload

    @Override       // chỉ cần gõ tên phương thức => ra gợi ý và chọn là ra.
    void inThongTin() {
        super.inThongTin();
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Phong Ban: " + phongBan);
        System.out.println("Luong: " + luong);
    }

}
