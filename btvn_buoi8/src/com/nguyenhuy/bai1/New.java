package com.nguyenhuy.bai1;

public class New {
    private String title;
    private String linkDetail;
    private String imgLink;
    private String date;

    public New(String title, String linkDetail, String imgLink, String date) {
        this.title = title;
        this.linkDetail = linkDetail;
        this.imgLink = imgLink;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getLinkDetail() {
        return linkDetail;
    }

    public String getImgLink() {
        return imgLink;
    }

    public String getDate() {
        return date;
    }

    public void print(){
        System.out.println("Title: " + title );
        System.out.println("Link Info: " + linkDetail);
        System.out.println("Link Image: " + imgLink);
        System.out.println("Time: " + date);
    }

}
