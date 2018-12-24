package com.nguyenhuy.bai1;

import java.util.ArrayList;

public class MessageManager {
    ArrayList<Message> messages = new ArrayList<Message>();

    public int checkExist(String time){
        for(int i = 0; i < messages.size(); i++){
            if(messages.get(i).getTime().equals(time)){
                return i;
            }
        }
        return -1;
    }

    public void add(Message message){
        int exist = checkExist(message.getTime());
        if(exist == -1){
            messages.add(message);
        }else {
            System.out.println("Tin nhan da ton tai");
        }
    }

    public void edit(Message message){
        int exist = checkExist(message.getTime());
        if(exist >= 0){
            messages.set(exist, message);
            System.out.println("Da sua tin nhan");
        }else {
            System.out.println("Tin nhan khong ton tai");
        }
    }

    public void delete(String time){
        int exist = checkExist(time);
        if(exist >= 0){
            messages.remove(exist);
            System.out.println("Da xoa tin nhan");
        }else {
            System.out.println("Tin nhan khong ton tai");
        }
    }

    public void showAll(){
        for(Message m : messages){
            System.out.println("=====");
            m.show();
        }
    }
}
