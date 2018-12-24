package kethua;

public class SinhVien extends ConNguoi {
    String maSV;
    String lop;
    float diem;

    public SinhVien(String ten, int tuoi, String diaChi,
             boolean gioiTinh, String soDienThoai, String maSV, String lop, float diem) {   // khi khai báo lớp SinhVien
        super(ten, tuoi, diaChi, gioiTinh, soDienThoai);  // kế thừa từ ConNguoi, phải gọi lại Constructor alt + enter
        this.maSV = maSV;
        this.lop = lop;
        this.diem = diem;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Lop: " + lop);
        System.out.println("Ma Sinh Vien: " + maSV);
        System.out.println("Diem: " + diem);
    }
}
