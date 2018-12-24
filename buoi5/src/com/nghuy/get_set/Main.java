package com.nghuy.get_set;

public class Main {
    public static void main(String[] args) {
        DeMo demo = new DeMo(5,7);
        System.out.println(demo.getA());
        demo.setA(10);
        System.out.println(demo.getA());
    }

}
