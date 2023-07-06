package at.mou.ruu.pieces;

import at.mou.ruu.Board;
import at.mou.ruu.Position;

public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    public boolean canMove(Board board, Position start, Position end) {
        return false;
    }

    @Override
    public char getStringRepresentation() {
        return 'P';
    }
}
