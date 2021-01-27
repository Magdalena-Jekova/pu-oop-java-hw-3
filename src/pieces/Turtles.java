package pieces;

import java.awt.*;

public class Turtles extends Pieces{

    public Turtles(int row, int col, Color color) {
        super(row, col, color);
    }

    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {
        return false;
    }

    @Override
    public void render(Graphics g) {
        int turtleX = this.col * (PIECE_SIZE * 2);
        int turtleY = this.row * (PIECE_SIZE * 2);

        g.setColor(Color.RED);
        g.fillOval(turtleX + 20,turtleY + 30,60,60);

        g.setColor(Color.lightGray);
        g.fillOval(turtleX + 25,turtleY + 35, PIECE_SIZE, PIECE_SIZE);

        this.pieceId = "T";
        g.setColor(Color.BLACK);
        g.drawString(this.pieceId, turtleX + 47, turtleY + 65);
    }
}