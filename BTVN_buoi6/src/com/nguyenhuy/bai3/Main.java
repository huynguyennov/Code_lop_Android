package com.nguyenhuy.bai3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addProvince(new Province(25, "Nam Dinh"));
        menu.addProvince(new Province(01, "Ha Noi"));
        menu.addProvince(new Province(02, "TP HCM"));
        menu.addTidbit(25, new Tidbit(01, "Pho bo Nam Dinh", "Mon pho gia truyen cua nguoi Nam Dinh",
                "phobonamdinh.vn","phobonamdinh.icon"));
        menu.addTidbit(25, new Tidbit(02, "Gao Tam Hai Hau", "Loai gao deo thom va san luong moi mua khong nhieu",
                "gaotamhaihau.vn", "gaotamhaihau.icon"));
        menu.addTidbit(25, new Tidbit(03, "Gao Tam Hai Hau", "loai 2",
                "gaotamhh.com", "gaotamhhloai2.icon"));
        menu.addTidbit(01, new Tidbit(01, "Tao Pho", "Mon an gan lien voi nhieu ky niem cua nhung dua tre sinh ra va lon len tai Ha Noi",
                "taopho.hn.vn", "taopho.icon"));
        menu.addTidbit(01, new Tidbit(02, "com Lang Vong", "Mui huong thanh tao cua com va la Sen",
                "comlangvong.vn", "comlangvong.icon"));
        menu.addTidbit(02, new Tidbit(01, "Banh Xeo", "Mon an noi tieng cua nguoi Nam bo",
                "banhxeosaigon.vn", "banhxeo.icon"));
        menu.showTidbid(01);
        menu.showTidbid(25);
        menu.findTidbid(25, "Gao Tam Hai Hau");
        menu.removeTidbid(01, 02);
        menu.showTidbid(01);
    }
}
