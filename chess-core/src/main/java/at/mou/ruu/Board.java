package at.mou.ruu;

import at.mou.ruu.pieces.*;

public class Board {
    Position[][] positions = new Position[8][8];

    public Board() {
        this.resetBoard();
    }

    public Position getPosition(int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }

        return this.positions[x][y];
    }

    public void printBoard() {
        String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_WHITE = "\u001B[37m";
        for (Position[] inner : this.positions){
            for (Position position : inner) {
                boolean hasPieceAndIsWhite = position.getPiece() != null && !position.getPiece().getIsWhite();
                String colour = hasPieceAndIsWhite ? ANSI_BLACK : ANSI_RESET;
                System.out.print(colour + ANSI_GREEN_BACKGROUND + position.getStringRepresentation() + ANSI_RESET);
            }
            System.out.println();
        }
    }

    private void resetBoard() {
        this.positions[0][0] = new Position(0, 0, new Rook(true));
        this.positions[0][1] = new Position(0, 1, new Knight(true));
        this.positions[0][2] = new Position(0, 2, new Bishop(true));
        this.positions[0][3] = new Position(0, 3, new King(true));
        this.positions[0][4] = new Position(0, 4, new Queen(true));
        this.positions[0][5] = new Position(0, 5, new Bishop(true));
        this.positions[0][6] = new Position(0, 6, new Knight(true));
        this.positions[0][7] = new Position(0, 7, new Rook(true));

        for (int i = 0; i < 8; i++) {
            this.positions[1][i] = new Position(1, i, new Pawn(true));
        }

        for (int j = 2; j < 6; j++) {
            for (int i = 0; i < 8; i++) {
                this.positions[j][i] = new Position(j, i, null);
            }
        }

        for (int i = 0; i < 8; i++) {
            this.positions[6][i] = new Position(1, i, new Pawn(false));
        }

        this.positions[7][0] = new Position(0, 0, new Rook(false));
        this.positions[7][1] = new Position(0, 1, new Knight(false));
        this.positions[7][2] = new Position(0, 2, new Bishop(false));
        this.positions[7][3] = new Position(0, 3, new King(false));
        this.positions[7][4] = new Position(0, 4, new Queen(false));
        this.positions[7][5] = new Position(0, 5, new Bishop(false));
        this.positions[7][6] = new Position(0, 6, new Knight(false));
        this.positions[7][7] = new Position(0, 7, new Rook(false));
    }
}
