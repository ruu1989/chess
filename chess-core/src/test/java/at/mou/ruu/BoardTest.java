package at.mou.ruu;

import org.junit.Test;


public class BoardTest {
    @Test
    public void positionInstantiatesCorrectly() {
        // Implicitly tests getters and setters via constructor
        Board b = new Board();
        b.printBoard();
    }
}
