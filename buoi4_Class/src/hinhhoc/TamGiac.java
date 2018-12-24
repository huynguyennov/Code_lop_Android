package hinhhoc;

public class TamGiac extends HinhHoc {
    protected float canhA;
    protected float canhB;
    protected float canhC;

    public TamGiac(String ten, float canhA, float canhB, float canhC) {
        super(ten);
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    @Override
    void chuVi() {
        float chuVi = canhA + canhB + canhC;
        System.out.println("Chu vi: " + chuVi);
    }

    @Override
    void dienTich() {
        float chuVi = (canhA + canhB + canhC) / 2;
        float dienTich = chuVi * (chuVi - canhA) * (chuVi - canhB) * (chuVi - canhC);
        dienTich = (float) Math.sqrt(dienTich);
        System.out.println("Dien tich:" + dienTich);
    }
}
