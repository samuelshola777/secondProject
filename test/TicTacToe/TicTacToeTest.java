package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private  TicTacToe ticTacToe;

    private Player player1;
    private Player player2;

    @BeforeEach


@Test
    void setupTic(){
     ticTacToe   = new TicTacToe(player1, player2);

    }
    @Test
    void checkIfObjectExist(){
        assertNotNull(ticTacToe);

    }
    @Test
    void playerExist(){
        assertNotNull(ticTacToe.getPlayer1());
        assertNotNull(ticTacToe.getPlayer2());
    }


}
