package pieces;

import java.awt.*;

public class FrogsLeader extends Pieces {

    public FrogsLeader(int row, int col, Color color){
        super(row, col, color);
    }

    /**
     * Метод за визуализиране на лидерите, в зависимост от техния цвят.
     * @param g Graphics object
     */
    @Override
    public void render(Graphics g) {

        int frogsLeaderX = this.col * (PIECE_SIZE * 2);
        int frogsLeaderY = this.row * (PIECE_SIZE * 2);

        g.setColor(color);
        if (color.equals(Color.YELLOW)) {
            g.fillRect(frogsLeaderX + 20, frogsLeaderY + 30, PIECE_SIZE, PIECE_SIZE);
            this.pieceId = "yLeader";
        }

        if(color.equals(Color.GREEN)){
            g.fillRect(frogsLeaderX + 30,frogsLeaderY + 20, PIECE_SIZE, PIECE_SIZE);
            this.pieceId = "gLeader";
        }

        g.setColor(Color.BLACK);
        g.drawString(this.pieceId, frogsLeaderX + 30, frogsLeaderY + 55);
    }

    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {
        return ((moveRow > this.row && moveCol == this.col) || (moveRow < this.row && moveCol == this.col))
                || ((moveRow == this.row && moveCol < this.col) || (moveRow == this.row && moveCol > this.col));
    }

    /**
     * Метод, при извикването на който фигурата се премества на друго поле от дъската,
     * ако движението е валидно.
     * @param row - редът, на който фигурата ще се премести
     * @param col- колоната, на която фигурата ще се премести
     */
    @Override
    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }
}