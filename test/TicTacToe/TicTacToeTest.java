package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static TicTacToe.TicTacToe.*;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;

    @BeforeEach
    public void setUp(){
    ticTacToe = new TicTacToe();}
    @Test
    public void testPlayerSymbol() {
        assertEquals("X", ticTacToe.player1);
        assertEquals("O", ticTacToe.player2);
    }
    @Test
    public void testGameBoard(){
        GAMEBOARD[0][0] = ticTacToe.player1;
        GAMEBOARD[0][1] = ticTacToe.player2;
        assertEquals("X", GAMEBOARD[0][0]);
        assertEquals("O", GAMEBOARD[0][1]);
    }
    @Test
 public void testLengthOfTheBoard(){
    assertEquals(3, gamelength.length);
 }
 @Test
 public void testGameIndex() {
        gameIndex = "5";
        GAMEBOARD[1][2] = gameIndex;
        assertEquals("5", GAMEBOARD[1][2]);
     System.out.println(Arrays.deepToString(GAMEBOARD));
 }
 @Test
    public void playerCanBeMoved(){
        GAMEBOARD[0][0]=ticTacToe.player1;
        GAMEBOARD[0][1] = ticTacToe.player2;
        assertEquals(ticTacToe.player1, GAMEBOARD[0][0]);
        assertEquals(ticTacToe.player2, GAMEBOARD[0][1]);

 }

}