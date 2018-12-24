package bai1_Animals;

public class Main {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Cho Shiba", "Nhat Ban", "Vang", "Ted", 4,
                "Beo", "Thong minh", 9);
        dog1.moTa();
        dog1.sua();
        dog1.coiNha();

        System.out.println();

        Dogs dog2 = new Dogs("Cho Phu Quoc", "Viet Nam", "Den", "Boss", 3,
                "Gay", "Nhanh nhen", 9.5F);
        dog2.moTa();
        dog2.sua();
        dog2.coiNha();
        dog2.soSanhKhaNangDanhHoi(dog1);
        System.out.println("=============");

        Cats cat1 = new Cats("Meo Anh long ngan", "Anh", "Xam", "Hoang Thuong", 1,
                "Mat xanh", "Sach se", 7.5F);
        cat1.moTa();
        cat1.keuMeoMeo();
        cat1.batChuot();
        System.out.println();

        Cats cat2 = new Cats("Meo Xiem","Thai Lan", "Den Xam", "Xiem", 2, "Tai dai","Nhanh nhen", 9);
        cat2.moTa();
        cat2.keuMeoMeo();
        cat2.batChuot();
        cat2.soSanhKhaNangNhinDem(cat1);
    }
}
