package practices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMTest {
    @Test void lcmOfACertainNumberCanBeGenerated(){
        assertEquals(24, LCM.getLCM(new int[]{3,6,8}));
    }

}