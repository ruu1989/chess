package at.mou.ruu.pieces;

import at.mou.ruu.Board;
import at.mou.ruu.Position;

public abstract class Piece {
    private boolean isWhite, isKilled = false;

    public Piece(boolean isWhite) {
        // I see a lot of using setters in the constructor vs. accessing method - any preferred?
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

    public abstract boolean canMove(Board board, Position start, Position end);
    public abstract char getStringRepresentation();
}
