package bai2;

public class KhoanTien {
    protected String nguoiDung;
    protected String thoiGian;
    protected String diaDiem;
    protected int soTien;
    protected String lyDo;

    public static int tongTien = 0;

    KhoanTien(String nguoiDung, String thoiGian, String diaDiem, int soTien, String lyDo){
        this.nguoiDung = nguoiDung;
        this.thoiGian = thoiGian;
        this.diaDiem = diaDiem;
        this.soTien = soTien;
        this.lyDo = lyDo;
        tongTien += soTien;
    }

    void show(){
        System.out.println("Nguoi dung: " + nguoiDung);
        System.out.println("Thoi gian: " + thoiGian);
        System.out.println("Dia diem: " + diaDiem);
        System.out.println("So tien: " + soTien);
        System.out.println("Ly do: " + lyDo);
    }
}
