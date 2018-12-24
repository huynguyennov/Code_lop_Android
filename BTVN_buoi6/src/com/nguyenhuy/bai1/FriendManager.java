package com.nguyenhuy.bai1;

import java.util.ArrayList;
import java.util.Comparator;

public class FriendManager {
    ArrayList<Friend> friends = new ArrayList<Friend>();

    public int checkExist(String id){               // kiểm tra id truyền vào có trùng với id của 1 trong các phần tử trong ArrayList không
        for(int i = 0; i < friends.size(); i++){
            if(friends.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void add(Friend friend){                              // add Friend
        int exist = checkExist(friend.getId());
        if(exist == -1){
            friends.add(friend);
        }else {
            System.out.println("Da ket ban voi tai khoan nay");
        }
    }

    public void edit(Friend friend){
        int exist = checkExist(friend.getId());
        if(exist >= 0){
            friends.set(exist,friend);
            System.out.println("Da sua thong tin thanh cong");
        }else {
            System.out.println("Ban be can sua khong ton tai");
        }
    }

    public void remove(String id){
        int exist = checkExist(id);
        if(exist >= 0){
            friends.remove(exist);
            System.out.println("Da xoa ban be thanh cong");
        }else {
            System.out.println("Ban be can xoa khong ton tai");
        }
    }

    public void find(String id){
        int exist = checkExist(id);
        if(exist >= 0){
            System.out.println("=== Thong tin ban be can tim ===");
            friends.get(exist).show();
        }else {
            System.out.println("Khong tim thay ban be");
        }
    }

    public void sort(){
        friends.sort(comparator);
    }

    private Comparator<Friend> comparator = new Comparator<Friend>() {  // sap xep ArrayList theo do tuoi
        @Override
        public int compare(Friend o1, Friend o2) {
            if(o1.getAge() > o2.getAge()){
                return 1;
            }
            return -1;
        }
    };

    public void showAll(){
        for(Friend f : friends){
            System.out.println("=====");
            f.show();
        }
    }
}
