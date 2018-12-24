package com.nguyenhuy.bai6_btbs;

public class VideoMaster extends Master {
    protected Video video1;
    protected Video video2;

    public VideoMaster(Video video1, Video video2) {
        this.video1 = video1;
        this.video2 = video2;
    }

    @Override
    public void danhSach() {
        System.out.println("Danh sach video|||");
        System.out.println(video1.getTen());
        System.out.println(video2.getTen());
    }

    @Override
    public void thongTin() {
        System.out.println("Thong tin video|||");
        System.out.println(video1.toString());
        System.out.println(video2.toString());
    }

    @Override
    public void timKiem() {
        System.out.println("Tim kiem Video");
    }

    @Override
    public void play() {
        System.out.println("Play Video");
    }

    @Override
    public void pause() {
        System.out.println("Pause Video");
    }

    @Override
    public void stop() {
        System.out.println("Stop Video");
    }

    @Override
    public void seek() {
        System.out.println("Seek Video");
    }

    @Override
    public void next() {
        System.out.println("Next Video");
    }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public void delete() {
        System.out.println("Delete Video");
    }
}
