package DiaryEntry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    private  Diary myDiary;
    @BeforeEach
    public void setUp(){
        myDiary = new Diary("Ola1111", "1234     ");
    }
    @Test
    public void testCreateEntry(){
        myDiary.createEntry("How it began", "   ", 1);
        myDiary.createEntry("A moment at Capstone", "  ", 2);
        assertEquals(2, myDiary.checkForNumberOfEntries());
//
//        assertEquals(info, myDiary.checkEntry(1));
    }
    @Test
    public void testViewEntry(){
        myDiary.createEntry("How it's going", "Omo I no go lie you", 1);
        //System.out.println(myDiary.viewEntry(1).toString());
        String info = """
                1. Entry Title: How it's going
                2. Entry Body: Omo I no go lie you
                3. Entry Id: 1""";

        assertEquals(info, myDiary.viewEntry(1).toString());

    }
    @Test
    public void testDeleteEntry(){
        myDiary.createEntry("How it's going", "Omo I no go lie you", 1);
        myDiary.createEntry("How it started", "e choke", 2);
        myDiary.deleteEntry( 1);
        assertEquals(null, myDiary.checkEntry(1));
    }
    @Test
    public void testEditEntry(){
        myDiary.createEntry("How it's going", "Omo I no go lie you", 1);
        myDiary.createEntry("How it started", "e choke", 2);
        myDiary.editEntry("How it began", "Omo I no fit lie give you", 1);
        System.out.println(myDiary.checkEntry(1));
//        assertEquals(info, myDiary.viewEntry(1).toString());

    }

}