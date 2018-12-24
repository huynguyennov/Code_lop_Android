package bai1_Animals;

public class Dogs extends Mammals {
    protected float khaNangDanhHoi;

    public Dogs(String chungLoai, String nguonGoc, String mauSac, String tenGoi, int tuoi, String dacDiem, String dacTinh, float khaNangDanhHoi) {
        super(chungLoai, nguonGoc, mauSac, tenGoi, tuoi, dacDiem, dacTinh);
        this.khaNangDanhHoi = khaNangDanhHoi;
    }

    @Override
    void moTa() {
        super.moTa();
        System.out.println("Kha nang danh hoi: " + khaNangDanhHoi);
    }

    void sua(){

    }

    void coiNha(){

    }

    void soSanhKhaNangDanhHoi(Dogs dog){
        if(this.khaNangDanhHoi < dog.khaNangDanhHoi){
            System.out.println("Cho " + this.tenGoi + " co kha nang danh hoi kem hon cho " + dog.tenGoi);
        }
        else if(this.khaNangDanhHoi == dog.khaNangDanhHoi){
            System.out.println("2 chu cho co kha nang danh hoi bang nhau!");
        }
        else{
            System.out.println("Cho " + this.tenGoi + " co kha nang danh hoi tot hon cho " + dog.tenGoi);
        }
    }
}
