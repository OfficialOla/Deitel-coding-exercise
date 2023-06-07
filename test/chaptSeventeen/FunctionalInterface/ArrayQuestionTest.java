package chaptSeventeen.FunctionalInterface;

import org.junit.jupiter.api.Test;

import static chaptSeventeen.FunctionalInterface.ArrayQuestion.countIntegers;
import static org.junit.jupiter.api.Assertions.*;

class ArrayQuestionTest {

    @Test
    public void testCountIntegers() {
        String[] arr = {"Ab@@ 1396", "Q 2RBS", "G381AC"};
        int expectedCount = 8;
        assertEquals(expectedCount, countIntegers(arr));
    }
}