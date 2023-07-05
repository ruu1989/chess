package at.mou.ruu.pieces;

import at.mou.ruu.Board;
import at.mou.ruu.Position;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    public boolean canMove(Board board, Position start, Position end) {
        return false;
    }

    @Override
    public char getStringRepresentation() {
        return 'B';
    }
}
