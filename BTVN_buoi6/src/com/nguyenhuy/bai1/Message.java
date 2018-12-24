package com.nguyenhuy.bai1;

public class Message {
    private String userId;
    private String time;
    private String content;
    private boolean type;
    private String status;

    public Message(String userId, String time, String content, boolean type, String status) {
        this.userId = userId;
        this.time = time;
        this.content = content;
        this.type = type;
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void show(){
        System.out.println("Nguoi nhan tin: " + userId);
        System.out.println("Thoi gian: " +time);
        System.out.println("Noi dung: " + content);
        System.out.println("Kieu tin nhan: " + (type ? "Gui den" : "Gui di"));
        System.out.println("Trang thai: " + status);
    }
}
