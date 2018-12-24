package com.nguyenhuy.manager;

import com.nguyenhuy.model.Bot;

import java.awt.*;
import java.util.ArrayList;

public class GameManager {  // quản lý hinh anh của các đối tượng game
    private ArrayList<Bot> bots; // dung Arraylist de quan ly cac doi tuong Bot

    public void initGame() { //
        bots = new ArrayList<Bot>();
        initBot();
    }

    public void initBot() {
        bots.add(new Bot(100, 100));
        bots.add(new Bot(200, 400));
        bots.add(new Bot(500, 250));
    }

    public void draw (Graphics2D g2d){
        for (Bot b : bots) {
            b.draw(g2d);  // ve tung doi tuong bot da tao
        }
    }

    public void AI() { // tao tự động di chuyển cho Bot
        for( int i = 0; i < bots.size(); i++){
            bots.get(i).move();
        }
    }
}
