package jp.ac.uryukyu.ie.ex2.pair21;

public class Main {
    public static void main(String[] args){
        Map map = new Map("map.txt");
        Player player = new Player(map.getStartPosX(),map.getStartPosY());

        map.printMap();
        player.moveLeft(map);
        map.printMap();
        player.moveDown(map);
        map.printMap();
        player.moveRight(map);
        map.printMap();
    }

}
