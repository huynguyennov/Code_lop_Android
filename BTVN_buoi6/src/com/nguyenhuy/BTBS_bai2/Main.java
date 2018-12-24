package com.nguyenhuy.BTBS_bai2;

public class Main {
    public static void main(String[] args) {
        QLCanBo qlCanBo = new QLCanBo();
        qlCanBo.add(new CongNhan("Tung", 1997, true, "Thai Binh", "CN001", 3.6F));
        qlCanBo.add(new KySu("Huy", 1996, true, "Nam Dinh", "KS001", "CNTT"));
        qlCanBo.add(new NhanVien("Huong", 1996, false, "Nam Dinh", "NV001", "Tiep tan"));
        qlCanBo.add(new CongNhan("Dung", 1992, false, "Thai Nguyen", "CN002", 4.5F));

        qlCanBo.showAll();

        qlCanBo.edit(new CongNhan("Huy", 1994, true, "Thai Binh", "CN001", 3.2F));
        qlCanBo.showAll();

        qlCanBo.find("Huy");

        qlCanBo.remove("CN002");
        qlCanBo.showAll();
    }


}
