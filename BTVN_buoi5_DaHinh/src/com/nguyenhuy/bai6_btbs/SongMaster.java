package com.nguyenhuy.bai6_btbs;

public class SongMaster extends Master{
    protected Song song1;
    protected Song song2;

    public SongMaster(Song song1, Song song2) {
        this.song1 = song1;
        this.song2 = song2;
    }

    @Override
    public void danhSach() {
        System.out.println("Danh sach bai hat|||");
        System.out.println(song1.getTen());
        System.out.println(song2.getTen());
    }

    @Override
    public void thongTin() {
        System.out.println("Thong tin bai hat|||");
        System.out.println(song1.toString());
        System.out.println(song2.toString());
    }

    @Override
    public void timKiem() {
        System.out.println("Tim kiem bai hat");
    }

    @Override
    public void play() {
        System.out.println("Play bai hat");
    }

    @Override
    public void pause() {
        System.out.println("Pause bai hat");
    }

    @Override
    public void stop() {
        System.out.println("Stop bai hat");
    }

    @Override
    public void seek() {
        System.out.println("Seek bai hat");
    }

    @Override
    public void next() {
        System.out.println("Next bai hat");
    }

    @Override
    public void previous() {
        System.out.println("Previous bai hat");
    }

    @Override
    public void delete() {
        System.out.println("Delete bai hat");
    }
}
