package jp.ac.uryukyu.ie.ex2.pair21;

public class Main {
    public static void main(String[] args){
        Map map = new Map("map.tet");
        Player player = new Player(map.getStartPosX(),map.getStartPosY());

        map.printMap();

        player.moveLeft();

        map.printMap();

        player.moveDown();

        map.printMap();

        player.moveRight();

        map.printMap();


    }

}
