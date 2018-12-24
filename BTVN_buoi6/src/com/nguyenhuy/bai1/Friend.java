package com.nguyenhuy.bai1;

public class Friend extends Account {
    private String status;

    public Friend(String id, String name, int age, String email, String status) {
        super(id, name, age, email);
        this.status = status;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Moi quan he: " + status);
    }
}
