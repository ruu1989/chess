package at.mou.ruu.pieces;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class PieceTest {
    private Piece p;

    @Before
    public void setUp() {
        this.p = Mockito.mock(
                Piece.class, Mockito.withSettings().useConstructor(true).defaultAnswer(Mockito.CALLS_REAL_METHODS)
        );
    }

    @Test
    public void pieceCanBeInstantiated() {
        assertThat(this.p, instanceOf(Piece.class));
    }

    @Test
    public void isWhiteDefaultsToTrueAndCanBeGetAndSet() {
        assertTrue(this.p.getIsWhite());

        this.p.setIsWhite(false);
        assertFalse(this.p.getIsWhite());
    }

    @Test
    public void isKilledDefaultsToFalseAndCanBeGetAndSet() {
        assertFalse(this.p.getIsKilled());

        this.p.setIsKilled(true);
        assertTrue(this.p.getIsKilled());
    }
}
