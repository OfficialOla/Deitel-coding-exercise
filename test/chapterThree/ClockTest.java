package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
        @Test
public void clockCanBeCreated() {
// Given that i have a clock
    Clock myClock = new Clock(22, 59, 50);
    assertNotNull(myClock);
        }
        @Test
    public void displayHour() {
            Clock myClock = new Clock(7, 56, 54);
//            myClock.setHour();
            assertEquals(7, myClock.getHour());
        }
}