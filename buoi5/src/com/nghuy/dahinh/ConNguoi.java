package com.nghuy.dahinh;

public abstract class ConNguoi {
    String ten;
    int tuoi;
    boolean gioiTinh;
    String diaChi;
    DongVat dongVat;

    public ConNguoi(String ten, int tuoi, boolean gioiTinh, String diaChi, DongVat dongVat) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.dongVat = dongVat;
    }

    /*@Override
    public String toString() {
        return "ConNguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + (gioiTinh ? "Nam" : "Nu") +
                ", diaChi='" + diaChi + '\'' +
                ", dongVat=" + dongVat +
                '}';
    }*/

    void inThongTin(){
        System.out.println("Ten:" + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + (gioiTinh ? "Nam" : "Nu"));
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Thong tin dong vat: ");
        System.out.println(dongVat.toString());
        boolean isDog = dongVat instanceof Cho;     // Kiem tra xem doi tuong dongVat nay
                                                    // co phai la doi tuong Cho khong
        if(isDog == true){                   // vì dongVat không có phương thức sua() của lớp cụ thể Cho nên nếu lấy
                                            //  để gọi phương thức sua() thì sẽ báo
            Cho cho = (Cho) dongVat;        // => ép kiểu dongVat theo kiểu (Cho) để có thể gọi được phương thức sua()
            cho.sua();
        }else{
            Meo meo = (Meo) dongVat;        // ép kiểu dongVat theo kiểu (Meo)
            meo.batChuot();
        }
    }

}
