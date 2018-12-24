package com.nguyenhuy.bai1;

public class Car {
    private String carID;
    private String name;
    private String number;
    private String term;
    private String typePos;
    private int price;
    private char starPos;
    private char destPos;
    private int kmTotal;
    private int costTotal;

    public Car(String carID, String name, String number, String term, String typePos, int price, char starPos, char destPos) {
        this.carID = carID;
        this.name = name;
        this.number = number;
        this.term = term;
        this.typePos = typePos;
        this.price = price;
        this.starPos = starPos;
        this.destPos = destPos;
        this.kmTotal = 0;
        this.costTotal = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID='" + carID + '\'' +
                ", Ten lai xe='" + name + '\'' +
                ", Bien so xe='" + number + '\'' +
                ", Hang xe='" + term + '\'' +
                ", Loai xe='" + typePos + '\'' +
                ", Gia cuoc / 1km=" + price +
                ", Vi tri hien tai=" + starPos +
                ", Vi tri den=" + destPos +
                ", So km da di=" + kmTotal +
                '}';
    }

    public void showInfor(){
        System.out.println(toString());
    }

    public void showCost
}
