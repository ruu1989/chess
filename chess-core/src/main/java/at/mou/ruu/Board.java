package at.mou.ruu;

import at.mou.ruu.pieces.Piece;
import javafx.geometry.Pos;

public class Board {
    Position[][] positions;

    public Board() {
        this.resetBoard();
    }

    public Position getPosition(int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }

        return this.positions[x][y];
    }

    private void resetBoard() {
//        this.positions[0][0] = new Position(0, 0, new Piece(true));
    }
}
