package com.nguyenhuy.bai4_BTBS;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Leo", 34, 1.7F);
        lion.show();
        System.out.println("=======");
        Snake snake = new Snake("Boa", 5.2F, 3.7F);
        snake.show();
        System.out.println("=======");
        Monkey monkey = new Monkey("Hugo", 21.5F, "Chuoi");
        monkey.show();
    }
}
