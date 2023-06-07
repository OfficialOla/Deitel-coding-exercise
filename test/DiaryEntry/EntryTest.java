package DiaryEntry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    private Entry myEntry;
    @BeforeEach
    public void setUp(){
        myEntry = new Entry("How it started", "And it all began", 1);
    }
    @Test
    public void testIHaveAnEntry(){
        myEntry.setTitle("How it began");
        assertEquals("How it began", myEntry.checkTitle());
    }

    @Test
    public void testEntryHasABody(){
        myEntry.setBody(" ");
        assertEquals(" ", myEntry.checkBody());
    }
    @Test
    public void testEntryHasAnId() {
        myEntry.setEntryId(2);
        assertEquals(2, myEntry.checkEntryId());
    }
    @Test
    public void testEntryHasDate(){
//        myEntry.setDate();
        assertEquals(LocalDateTime.now(), myEntry.checkDate());
    }
}