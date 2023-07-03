package at.mou.ruu;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ChessTest {
    @Test
    public void chessClassCanBeInstantiated() {
        Chess c = new Chess();
        assertThat(c, instanceOf(Chess.class));
    }
}
