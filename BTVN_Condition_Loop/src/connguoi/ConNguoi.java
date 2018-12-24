package connguoi;

public class ConNguoi {
    String ten;
    DongVat dongVat;

    ConNguoi(String giaTriTen){
        ten = giaTriTen;
        dongVat = new DongVat("Cu Cu");
    }

    void sayHello(){
        System.out.println(ten + " xin chao!");
    }

    class DongVat {
        String ten;

        DongVat(String ten) {
            this.ten = ten;
        }

        void inTen() {
            System.out.println("Ten dong vat la: " + ten);
            System.out.println("Ten con nguoi la: " + ConNguoi.this.ten);
        }
    }
}
