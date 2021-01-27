package pieces;

import java.awt.*;

public abstract class Pieces {

    public static final int PIECE_SIZE = 50;
    protected int row;
    protected int col;
    protected Color color;
    protected String pieceId;
    
    public Pieces(int row, int col, Color color){
        this.row   = row;
        this.col   = col;
        this.color = color;
    }

    public String getPieceId() {
        return pieceId;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public abstract void render(Graphics g);

    public boolean isMoveValid(int moveRow, int moveCol){return false;};

    public void move(int row, int col){};
}