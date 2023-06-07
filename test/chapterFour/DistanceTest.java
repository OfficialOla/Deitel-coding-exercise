package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DistanceTest {

    @Test
    public  void testTwoPerpendicularLinesAreEqual() {
        assertTrue(DistanceExercise.isPerpendicular(2,2,4,5));
    }
    @Test
    public void testThaCoordinatesWithoutSlopeDon_tLieOnPerpendicular(){
        assertFalse(DistanceExercise.isPerpendicular(2, 2, 4, 5));
    }
}
