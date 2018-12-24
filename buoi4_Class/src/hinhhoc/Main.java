package hinhhoc;

public class Main {
    public static void main(String[] args) {
        TamGiac tamGiac = new TamGiac("Tam Giac", 6,7,10);
        tamGiac.chuVi();
        tamGiac.dienTich();
        System.out.println("============");
        HinhChuNhat hinhChuNhat = new HinhChuNhat("Hinh chu nhat", 12, 20);
        hinhChuNhat.chuVi();
        hinhChuNhat.dienTich();
    }
}
