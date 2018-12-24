package bai2;

public class Main {
    public static void main(String[] args) {
        KhoanThu thu1 = new KhoanThu("Huy", "19/03/2016", "Cty FPT",
                5000000, "Luong thang 3", "Huy");
        thu1.show();
        System.out.println();
        KhoanThu thu2 = new KhoanThu("Huy", "20/03/2016", "Nha rieng",
                2500000, "Tien thu phi nha tro anh Nam", "Huy");
        thu2.show();
        System.out.println();
        System.out.println("Tong tien thu trong tuan: " + KhoanThu.tongTien);
        System.out.println("=========");
        KhoanChi chi1 = new KhoanChi("Huy", "20/03/2016", "Lop LAND1602E",
                300000, "Mua do sinh nhat cac ban thang 3", "Lop LAND1602E");
        chi1.show();
        System.out.println();
        KhoanChi chi2 = new KhoanChi("Huy", "21/03/2016", "Cty FPT",
                35000, "An trua", "Quan an");
        chi2.show();
        System.out.println();
        KhoanChi chi3 = new KhoanChi("Huy", "21/03/2016", "Cafe Pho",
                45000, "Uong cafe Capuchio", "Cafe Cong");
        chi3.show();
        System.out.println();
        System.out.println("Tong tien chi trong tuan: " + KhoanChi.tongTien);
        System.out.println("=========");
        KhoanVay vay1 = new KhoanVay("Huy", "18/03/2016", "Ngan hang",
                10000000, "Vay mua may giat", "Ngan hang", 60, 1000,
                "18/05/2016", "Chua tra");
        vay1.show();
        System.out.println();
        KhoanVay vay2 = new KhoanVay("Huy", "19/03/2016", "Media Mart",
                8000000, "Vay mua dien thoai", "HD SaiSon", 60, 0,
                "19/05/2016", "Chua tra");
        vay2.show();
        System.out.println();
        System.out.println("Tong so tien vay trong tuan: " + KhoanVay.tongTien);
        System.out.println("=========");
        KhoanVay choVay1 = new KhoanVay("Huy", "12/03/2016", "Nha rieng",
                1000000, "Vay mua tu lanh", "Chi Hong", 7, 0,
                "12/05/2016", "Chua tra");
        choVay1.show();
        System.out.println();
        KhoanVay choVay2 = new KhoanVay("Huy", "15/03/2016", "Nha rieng",
                10000000, "Vay mua dat", "Anh Hoang", 30, 2000,
                "15/04/2016", "Chua tra");
        choVay2.show();
        System.out.println();
        System.out.println("Tong tien cho vay trong tuan: " + KhoanChoVay.tongTien);
    }
}
