package com.nguyenhuy.bai2;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register();
        manager.register();
        manager.register();
        manager.updateUserNotNull();
        manager.saveAllUsers();
        manager.login();
        manager.getAllUser();
        manager.showAllUser();
        manager.deleteUser("huynguyennov");
        manager.showAllUser();
    }
}
