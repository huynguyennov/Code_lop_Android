package com.nguyenhuy.kieuString.exception;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.exception();

    }

    private void exception(){
        try {
            String s = "232";
            int v = Integer.parseInt(s);    // unboxing
            System.out.println(v);
            char c = s.charAt(100);
            System.out.println(c);
        }catch (NumberFormatException | IndexOutOfBoundsException exc){ // bat loi theo y muon hoac dung Exception exc
            exc.printStackTrace();          // in noi dung loi
            System.out.println("Xay ra ngoai le!");
        }
        System.out.println("Ket thuc");

        MyException myException = new MyException();
        myException.print();

    }


}
