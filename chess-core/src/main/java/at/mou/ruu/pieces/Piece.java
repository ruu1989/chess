package at.mou.ruu.pieces;

import at.mou.ruu.Board;
import at.mou.ruu.Position;
import org.javatuples.Pair;

import java.util.List;

enum MoveResult {
    EMPTY,
    INVALD,
    TAKE
}

public abstract class Piece {
    private boolean isWhite, isKilled = false;

    public Piece(boolean isWhite) {
        this.setIsWhite(isWhite);
    }

    public boolean getIsWhite() {
        return this.isWhite;
    }

    public void setIsWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean getIsKilled() {
        return this.isKilled;
    }

    public void setIsKilled(boolean isKilled) {
        this.isKilled = isKilled;
    }

    public abstract List<Pair<Integer, Integer>> validMovements(Board board, Position start) throws Exception;
    public abstract MoveResult canMove(Board board, Position start, Position end) throws Exception;
    public abstract char getStringRepresentation();
}
