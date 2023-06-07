package chapterSeven;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindOddTest {
    @Test
    public void testFindOdd(){
        int[] numbers = {11,12,13,14,19,5};
        int[] oddElements = FindOdd.findodd(numbers);
        int[] expected = {11,13,19,5};
        assertArrayEquals(expected, oddElements);
    }

}