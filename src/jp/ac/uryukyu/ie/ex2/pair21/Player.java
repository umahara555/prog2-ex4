package jp.ac.uryukyu.ie.ex2.pair21;

public class Player {
    int posX;
    int posY;
    int countStep;

    public Player(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public void moveLeft(Map map){
        if (!(map.judgeWall(posX-1, posY))){
            posX -= 1;
            map.setPlayerPosX(posX);
        }
    }

    public void moveRight(Map map){
        if (!(map.judgeWall(posX+1, posY))){
            posX += 1;
            map.setPlayerPosX(posX);
        }
    }

    public void moveUp(Map map){
        if (!(map.judgeWall(posX, posY-1))){
            posY -= 1;
            map.setPlayerPosY(posY);
        }
    }

    public void moveDown(Map map){
        if (!(map.judgeWall(posX, posY+1))){
            posY += 1;
            map.setPlayerPosY(posY);
        }
    }
}
