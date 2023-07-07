package at.mou.ruu.pieces;

import static org.junit.Assert.*;

import at.mou.ruu.Board;
import org.javatuples.Pair;
import org.junit.Test;

import java.util.List;


public class PawnTest {

    @Test
    public void pawnCanMoveForwardOneOrTwoAtStartAsWhite() throws Exception {
        Board board = new Board();
        List<Pair<Integer, Integer>> validMovements = board.getPosition(6, 3).validMovements();
        System.out.println(validMovements);
        assertEquals(2, validMovements.size());
    }
}
