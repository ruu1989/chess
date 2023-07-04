package at.mou.ruu;

import at.mou.ruu.pieces.Piece;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class PositionTest {
    @Test
    public void positionInstantiatesCorrectly() {
        // Implicitly tests getters and setters via constructor
        Piece piece = Mockito.mock(Piece.class, Mockito.CALLS_REAL_METHODS);
        Position p = new Position(1, 2, piece);
        assertEquals(1, p.getX());
        assertEquals(2, p.getY());
        assertEquals(piece, p.getPiece());
    }
}
