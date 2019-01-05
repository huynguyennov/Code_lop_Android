package com.nguyenhuy.manager;

import com.nguyenhuy.model.Boom;
import com.nguyenhuy.model.Bot;
import com.nguyenhuy.model.MapBoom;
import com.nguyenhuy.model.Player;

import java.awt.*;
import java.util.ArrayList;

public class GameManager {  // quản lý hinh anh của các đối tượng game
    ArrayList<Boom> arrBoom;  // tạo arrayList của Boom
    private ArrayList<Bot> bots; // dung Arraylist de quan ly cac doi tuong Bot
    private Player player;
    private MapManager mapManager = new MapManager();

    public void initGame() {
        mapManager.readMap("mapGame1.txt");
        arrBoom = new ArrayList<Boom>();
        player = new Player(200, 200);
        bots = new ArrayList<Bot>();
        initBot();
    }

    public void initBot() {
        bots.add(new Bot(100, 100));
        bots.add(new Bot(200, 400));
        bots.add(new Bot(500, 250));
    }

    public void draw (Graphics2D g2d){
        // vẽ map
        for (MapBoom mapBoom : mapManager.getArrMap()){
            mapBoom.draw(g2d);
        }
        // Cho boom lên đầu đề Boom ở dưới cùng, tránh việc Bot và Play bị boom đè ở dưới
        // xử lý ảnh cho Boom
        for(int i = arrBoom.size() - 1; i >= 0; i--){ // dùng for ngược để tránh xoá đi các phần tử Boom chưa được sử dụng
            boolean check = arrBoom.get(i).draw(g2d);   // gán check cho giá trị boolean trả về của phương thức draw của Boom
            if (check){ // nếu đúng thì xoá đối tượng
                arrBoom.remove(i);
            }
        }
        for (Bot b : bots) {
            b.draw(g2d);  // ve tung doi tuong bot da tao
        }
        player.draw(g2d);
    }

    public void movePlayer (int newOrient) {
        player.changeOrient(newOrient); // phuong thuc thay doi huong Orient tu lop Player
        player.move();  // phuong thuc tu lop cha Entity
    }

    // xử lý đặt boom cho player
    public void playerFire() {
        player.fire(arrBoom);
    }

    public void AI() { // tao tự động di chuyển cho Bot
        for( int i = 0; i < bots.size(); i++){
            bots.get(i).move();
        }
    }
}
