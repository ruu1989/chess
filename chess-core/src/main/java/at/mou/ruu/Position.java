package at.mou.ruu;

import at.mou.ruu.pieces.Piece;
import org.javatuples.Pair;

import java.util.List;

public class Position {
    private int x, y;
    private Piece piece;
    private Board board;

    public Position(int x, int y, Piece piece, Board board) {
        this.setX(x);
        this.setY(y);
        this.setPiece(piece);
        this.setBoard(board);
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(Board board) {
        this.board = board;
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

    public List<Pair<Integer, Integer>> validMovements() throws Exception {
        System.out.println(this.getPiece());
        return this.getPiece().validMovements(this.getBoard(), this);
    }

    public char getStringRepresentation() {
        if (this.piece == null) {
            return '.';
        }

        return this.piece.getStringRepresentation();
    }
}
