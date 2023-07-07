package at.mou.ruu.pieces;

import at.mou.ruu.Board;
import at.mou.ruu.Position;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Pair;

public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    public List<Pair<Integer, Integer>> validMovements(Board board, Position current) throws Exception {
        List<Pair<Integer, Integer>> validPositions = new ArrayList<>();
        boolean isWhite = current.getPiece().getIsWhite();
        int forward = (isWhite ? -1 : 1);

        if (isWhite) {
            // Hasn't moved yet, can move two spots.
            System.out.println(current.getX());
            if (current.getX() == 6) {
                System.out.println("IsFirst");
                validPositions.add(Pair.with(current.getX() + (forward * 2), current.getY()));
            }

            if (current.getY() > 0) {
                if(board.getPosition(current.getX() + forward, current.getY() - 1).getPiece() != null) {
                    validPositions.add(Pair.with(current.getX() + forward, current.getY() - 1));
                }
            }

            if (current.getY() < 7) {
                if(board.getPosition(current.getX() + forward, current.getY() + 1).getPiece() != null) {
                    validPositions.add(Pair.with(current.getX() + forward, current.getY() + 1));
                }
            }

            validPositions.add(Pair.with(current.getX() + forward, current.getY()));
        }

        return validPositions;
    }

    public MoveResult canMove(Board board, Position start, Position end) throws Exception {
        boolean isWhite = start.getPiece().getIsWhite();
        List<Position> validPositions = new ArrayList<>();

        int forward = (isWhite ? -1 : 1);




        return MoveResult.EMPTY;
    }

    @Override
    public char getStringRepresentation() {
        return 'P';
    }
}
