package hinhhoc;

public abstract class HinhHoc {
    protected String ten;

    public HinhHoc(String ten) {
        this.ten = ten;
        System.out.println(ten);
    }

    abstract void chuVi();
    abstract void dienTich();

    void inThongTin(){
        System.out.println("Ten: " + ten);
    }
}
