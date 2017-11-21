package jp.ac.uryukyu.ie.ex2.pair21;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Map {
    private int startPosX;
    private int startPosY;

    private int mapSizeX;
    private int mapSizeY;

    private char[][] map;

    private int playerPosX;
    private int playerPosY;


    public Map(String filename){
        try{
            File f = new File(filename);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String s;
            s = br.readLine();
            startPosX = Character.getNumericValue(s.charAt(0));
            startPosY = Character.getNumericValue(s.charAt(2));

            playerPosX = startPosX;
            playerPosY = startPosY;

            s = br.readLine();
            mapSizeX = Character.getNumericValue(s.charAt(0));
            mapSizeY = Character.getNumericValue(s.charAt(2));

            map = new char[mapSizeY][mapSizeX];

            int i = 0;
            while((s = br.readLine()) != null){
                for (int j=0; j<s.length(); j++){
                    map[i][j] = s.charAt(j);
                }
                i++;
            }
            fr.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printMap(){
        char[][] data = map;
        data[playerPosY][playerPosX] = 'P';
        for (char[] y: data){
            for (char x: y){
                System.out.print(x);
            }
            System.out.println("");
        }
    }

    public boolean judgeWall(int posx, int posy){
        if (map[posy][posx] == '#'){
            return true;
        }
        return false;
    }

    public int getStartPosX(){ return startPosX; }
    public int getStartPosY(){ return startPosY; }
    public int getMapSizeX(){ return mapSizeX; }
    public int getMapSizeY(){ return mapSizeY; }
    public void setPlayerPosX(int playerPosX){  this.playerPosX = playerPosX; }
    public void setPlayerPosY(int playerPosY){ this.playerPosY = playerPosY; }
}
