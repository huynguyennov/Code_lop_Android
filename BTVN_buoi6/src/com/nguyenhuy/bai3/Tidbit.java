package com.nguyenhuy.bai3;

public class Tidbit {
    private int id;
    private String name;
    private String description;
    private String linkDetail;
    private String linkIcon;

    public Tidbit(int id, String name, String description, String linkDetail, String linkIcon) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.linkDetail = linkDetail;
        this.linkIcon = linkIcon;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println("ID: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Mo ta: " + description);
        System.out.println("Link chi tiet mon an: " + linkDetail);
        System.out.println("Link anh dai dien: " + linkIcon);
    }
}
