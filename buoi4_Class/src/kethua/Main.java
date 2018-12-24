package kethua;

public class Main {
    public static void main(String[] args) {
        SinhVien sinhVien;
        sinhVien = new SinhVien("Nguyen Van Huy", 22,"Nam Dinh", true,
                "0868908672", "B14DCPT221", "D14CQPT001", 7.5F);
        sinhVien.inThongTin();

        NhanVien nhanVien;
        nhanVien = new NhanVien("Nguyen Thi B", 24, "Ha Noi", false,
                "0984567888", "Dev0075"); // ví dụ overload
        nhanVien.inThongTin();

        
    }
}
