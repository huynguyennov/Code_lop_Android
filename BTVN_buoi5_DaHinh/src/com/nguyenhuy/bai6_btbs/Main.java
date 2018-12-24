package com.nguyenhuy.bai6_btbs;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Anh van doi cho", "Nhac tre", 296,
                "Dan Truong", "128KB","Anh yeu em");
        Song song2 = new Song("Anh sai roi", "Nhac tre", 272,
                "Cao Thai Son", "320KB", "Anh sai");
        Video video1 = new Video("The flash", "Phim", 2750,
                "My", "Full HD");
        Video video2 = new Video("Teaser Cuoc doi cua Yen", "Phim", 278,
                "BHD", "Full HD");

        SongMaster songMaster = new SongMaster(song1, song2);
        songMaster.danhSach();
        songMaster.thongTin();
        songMaster.timKiem();
        songMaster.play();
        songMaster.next();
        songMaster.delete();
        System.out.println("=======");
        VideoMaster videoMaster = new VideoMaster(video1, video2);
        videoMaster.danhSach();
        videoMaster.thongTin();
        videoMaster.timKiem();
        videoMaster.play();
        videoMaster.seek();
        videoMaster.pause();
    }
}
