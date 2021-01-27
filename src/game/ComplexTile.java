package game;

import java.awt.*;

public class ComplexTile extends BoardTile{

    public ComplexTile(int row, int col){
        super(row, col);
    }

    /**
     * Метод за визуализиране на комлексното поле на дъската.
     * @param g Graphics object
     */
    @Override
    public void render(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillOval(225,225,50,50);
    }
}