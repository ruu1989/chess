package at.mou.ruu;

import at.mou.ruu.pieces.Piece;

public class Position {
    private int x, y;
    private Piece piece;

    public Position(int x, int y, Piece piece) {
        this.setX(x);
        this.setY(y);
        this.setPiece(piece);
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getStringRepresentation() {
        if (this.piece == null) {
            return '.';
        }

        return this.piece.getStringRepresentation();
    }
}
