package at.mou.ruu.pieces;

import at.mou.ruu.Board;
import at.mou.ruu.Position;
import org.javatuples.Pair;

import java.util.List;

public class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    public List<Pair<Integer, Integer>> validMovements(Board board, Position start) throws Exception {
        return null;
    }

    public MoveResult canMove(Board board, Position start, Position end) {
        return MoveResult.EMPTY;
    }

    @Override
    public char getStringRepresentation() {
        return 'R';
    }
}
