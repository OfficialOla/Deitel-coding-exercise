 import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import tdd.Utme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class UtmeTest {

    @Test
    public void firstDrillerTest() {
        Utme firstSet = new Utme();
        int result = firstSet.productOf(2);
        assertEquals(4000, result);
    }
    @Test
    public void secondTestDrillerTest() {
        Utme secondSet = new Utme();

        int result = secondSet.productOf(10);
        assertEquals(10, result);
    }
    @Test
    public void thirdTestDrillerTest() {
        Utme thirdSet = new Utme();

        int result = thirdSet.productOf(16);
        assertEquals(25600, result);
    }
    @Test
    public void fourthTestDrillerTest() {
        Utme fourthSet = new Utme();

        int result = fourthSet.productOf(30);
        assertEquals(45000, result);
    }

    @Test
    public void fifthTestDrillerTest() {
        Utme fifthSet = new Utme();

        int result = fifthSet.productOf(30);
        assertEquals(45000, result);
    }

    @Test
    public void sixthTestDrillerTest() {
        Utme sixthSet = new Utme();

        int result = sixthSet.productOf(199);
        assertEquals(238800, result);
    }

    @Test
    public void seventhTestDrillerTest() {
        Utme seventhSet = new Utme();

        int result = seventhSet.productOf(200);
        assertEquals(220000, result);
    }

    @Test
    public void eightTestDrillerTest() {
        Utme eightSet = new Utme();

        int result = eightSet.productOf(600);
        assertEquals(600000, result);
    }
}

