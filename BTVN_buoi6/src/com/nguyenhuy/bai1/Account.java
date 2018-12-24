package com.nguyenhuy.bai1;

public abstract class Account {
    protected String id;
    protected String name;
    protected int age;
    protected String email;

    public Account(String id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void show(){
        System.out.println("ID:" + id);
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Email: " + email);
    }
}
