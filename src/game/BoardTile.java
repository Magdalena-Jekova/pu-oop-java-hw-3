package game;

import java.awt.*;

public class BoardTile {

    public static final int TILE_SIZE = 100;
    private int row;
    private int col;

    public BoardTile(int row, int col){
        this.row = row;
        this.col = col;
    }

    /**
     * Метод за визуализиране на полетата на дъската.
     * @param g Graphics object
     */
    public void render (Graphics g){

        if ((row == 0 && (col == 0 || col == 4)) || (row == 4 && (col == 1 || col == 3))) {
            g.setColor(Color.ORANGE);
        } else if ((row == 0 && (col == 1 || col == 3) || (row == 4 && (col == 0 || col == 4)))){
            g.setColor(Color.BLACK);
        }else if((row == 1 && (col == 0 || col == 1 || col == 3 || col == 4))
                || (row == 3 && (col == 0 || col == 1 || col == 3 ||col ==4))){
            g.setColor(Color.GRAY);
        }else{
            g.setColor(Color.WHITE);
        }

        int boardTileX = this.col * TILE_SIZE;
        int boardTileY = this.row * TILE_SIZE;

        g.fillRect(boardTileX, boardTileY, TILE_SIZE - 1, TILE_SIZE - 1);
    }
}