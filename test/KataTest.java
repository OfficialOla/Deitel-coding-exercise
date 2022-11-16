import chapterFour.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void squareTest() {
        Kata kata = new Kata();

        int result = kata.squareOf(5);
        assertEquals(25, result);
    }

    @Test
    public void maxTest() {
        Kata kata = new Kata();

       int maximum = kata.maxOf(23, 12);
        assertEquals(23, maximum);
    }
    }
