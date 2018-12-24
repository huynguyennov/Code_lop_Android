package kethua;

public class ConNguoi {
    String ten;
    int tuoi;
    String diaChi;
    boolean gioiTinh;
    String soDienThoai;

    ConNguoi(String ten, int tuoi, String diaChi, boolean gioiTinh, String soDienThoai){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    void inThongTin(){
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        String gt = gioiTinh ? "Nam" : "Nu";
        System.out.println("Gioi Tinh: " + gt);
        System.out.println("So dien thoai: " + soDienThoai);
    }

}
