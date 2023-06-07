//package chapterSix;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CoinTossGameTest {
//    private CoinTossGame coinTossGame;
//
//    @BeforeEach
//    public void setUp(){
//        coinTossGame = new CoinTossGame();
//    }
//
//    @Test
//    public void testThatGameExists(){
//        assertNotNull(coinTossGame);
//    }
//    @Test
//    public void testMenuOption(){
//        String menu = CoinTossGame.getGameMenu();
//        assertTrue(menu.equals("""
//                1. Toss Coins
//                2. Exit Game
//                """));
//    }
//    @Test
//    public void testCoinFlip() {
//        String outcome = coinTossGame.flip();
//        assertNotNull(outcome);
//        assertTrue(outcome.equals("HEADS")||);
//    }
//}