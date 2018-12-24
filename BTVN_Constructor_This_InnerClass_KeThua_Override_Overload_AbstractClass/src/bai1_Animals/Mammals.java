package bai1_Animals;

public class Mammals {
    protected String chungLoai;
    protected String nguonGoc;
    protected String mauSac;
    protected String tenGoi;
    protected int tuoi;
    protected String dacDiem;
    protected String dacTinh;

    public Mammals(String chungLoai, String nguonGoc, String mauSac, String tenGoi, int tuoi, String dacDiem, String dacTinh) {
        this.chungLoai = chungLoai;
        this.nguonGoc = nguonGoc;
        this.mauSac = mauSac;
        this.tenGoi = tenGoi;
        this.tuoi = tuoi;
        this.dacDiem = dacDiem;
        this.dacTinh = dacTinh;
    }

    void moTa(){
        System.out.println("Ten goi: " + tenGoi);
        System.out.println("Chung loai: " + chungLoai);
        System.out.println("Nguon goc: " + nguonGoc);
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dac diem: " + dacDiem);
        System.out.println("Dac tinh: " + dacTinh);
    }

    void setChungLoai(String chungLoai){
        this.chungLoai = chungLoai;
    }

    String getChungLoai(){
        return chungLoai;
    }

    void setNguonGoc(String nguonGoc){
        this.nguonGoc = nguonGoc;
    }

    String getNguonGoc(){
        return nguonGoc;
    }

    void setMauSac(String mauSac){
        this.mauSac = mauSac;
    }

    String getMauSac(){
        return mauSac;
    }

    void setTenGoi(String tenGoi){
        this.tenGoi = tenGoi;
    }

    String getTenGoi(){
        return tenGoi;
    }

    void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }

    int getTuoi(){
        return tuoi;
    }

    void setDacDiem(String dacDiem){
        this.dacDiem = dacDiem;
    }

    String getDacDiem(){
        return dacDiem;
    }

    void setDacTinh(String dacTinh){
        this.dacTinh = dacTinh;
    }

    String getDacTinh(){
        return dacTinh;
    }
}
