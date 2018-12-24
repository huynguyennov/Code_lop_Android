package com.nguyenhuy.bai1;

public class Main {
    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount("huynguyennd0711", "Nguyen Van Huy", 22, "huynguyennd0711@gmail.com", "Huy07111996");
        myAccount.changePass();
        FriendManager manager = new FriendManager();
        manager.add(new Friend("huynguyennov", "Huy", 21, "huynguyennov@gmail.com", "Ban"));
        manager.add(new Friend("buihuund96", "Huu", 23, "buihuund96@gmail.com", "Ban than"));
        manager.add(new Friend("phamhieuptit", "Hieu", 24, "phamhieuptit95", "Ban Xa Giao"));

        manager.showAll();
        System.out.println("||| Sua thong tin ban be |||");
        manager.edit(new Friend("phamhieuptit", "Hieu", 22, "phamhieuptit96@gmail.com", "Nguoi quen"));
        manager.showAll();
        System.out.println("||| Sap xep theo do tuoi |||");
        manager.sort();
        manager.showAll();
        System.out.println("||| Tim kiem ban be |||");
        manager.find("huynguyennov");
        System.out.println("||| Xoa ban be |||");
        manager.remove("huynguyennd");
        manager.remove("buihuund96");
        manager.showAll();
        System.out.println();
        System.out.println("|||Tin nhan|||");
        MessageManager messageManager  = new MessageManager();
        messageManager.add(new Message("huynguyennov", "19:05-25/11/2018", "Mai co bai kiem tra",
                false, "Da gui"));
        messageManager.add(new Message("phamhieuptit", "9:28-28/11/2018", "Di cho nhe",
                true, "Da nhan"));
        messageManager.showAll();
        System.out.println("||| Sua tin nhan |||");
        messageManager.edit(new Message("huynguyennov", "19:05-25/11/2018", "Chieu mai co bai kiem tra",
                false, "Da gui"));
        messageManager.showAll();
        System.out.println("||| Xoa tin nhan |||");
        messageManager.delete("9:28-28/11/2018");
        messageManager.showAll();
    }
}
