package bai1_Animals;

public class Cats extends Mammals {
    protected float khaNangNhinDem;


    public Cats(String chungLoai, String nguonGoc, String mauSac, String tenGoi, int tuoi, String dacDiem, String dacTinh, float khaNangNhinDem) {
        super(chungLoai, nguonGoc, mauSac, tenGoi, tuoi, dacDiem, dacTinh);
        this.khaNangNhinDem = khaNangNhinDem;
    }

    @Override
    void moTa() {
        super.moTa();
        System.out.println("Kha nang nhin ban dem: " + khaNangNhinDem);
    }

    void keuMeoMeo(){

    }

    void batChuot(){

    }

    void soSanhKhaNangNhinDem(Cats cat){
        if(this.khaNangNhinDem < cat.khaNangNhinDem){
            System.out.println("Meo " + this.tenGoi + " co kha nang nhin dem kem hon meo " + cat.tenGoi);
        }
        else if(this.khaNangNhinDem == cat.khaNangNhinDem){
            System.out.println("2 chu meo co kha nang nhin dem bang nhau!");
        }
        else{
            System.out.println("Meo " + this.tenGoi + " co kha nang nhin dem tot hon meo " + cat.tenGoi);
        }
    }
}
