package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
public void validateTimeTest(){
        assertThrows(IllegalArgumentException.class, ()->new Time(23,23,60));
    }

}