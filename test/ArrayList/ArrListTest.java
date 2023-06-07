package ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class  ArrListTest {
    ArrList myArrList;

    @BeforeEach
    public void setUp(){
        myArrList = new ArrList();
    }

    @Test
    public void arrayListCanBeCreated(){
        assertNotNull(myArrList);
    }
    @Test
    public void newArrayListIsEmpty(){
        assertTrue(myArrList.isEmpty());
    }
    @Test
    public void addElement_ArrayListIsNotEmpty(){
        myArrList.add(35);
        assertFalse(myArrList.isEmpty());
    }
    @Test
    public void addXRemoveX_ArrayListIsNotEmpty(){
        myArrList.add(20);
        myArrList.remove();
        assertTrue(myArrList.isEmpty());
    }
    @Test
    public void addXAndY_RemoveY_ArrayListIsNotEmpty(){
        myArrList.add(49);
        myArrList.add(34);
        myArrList.remove();
        assertFalse(myArrList.isEmpty());
    }
    @Test
    public void removeFromEmptyArrayList_ArrayListShouldThrowAnException(){
        assertThrows(IllegalArgumentException.class, ()-> myArrList.remove());
    }
    @Test
    public void addX_ArrayListSizeIsOne(){
        myArrList.add(20);
        myArrList.add(1245);
        myArrList.remove();
        assertEquals(1, myArrList.size());
    }
    @Test
    public void addX_ArrayListSizeIncreases(){
        myArrList.add(99);
        myArrList.add(12);
        assertEquals(2, myArrList.size());
    }
    @Test
    public void insertElementInArrayList(){
        myArrList.add(17);
        myArrList.add(34, 1);
        myArrList.add(23, 2);
//        assertEquals(17, myArrList.get(0));
        assertEquals(23, myArrList.get(2));
        assertEquals(3, myArrList.size());
    }
    @Test
    public void addXYZ_getTheIndexOfY(){
        myArrList.add(34);
        myArrList.add(91);
        myArrList.add(123);
        assertEquals(91, myArrList.get(1));
    }
//    @Test
//    public void getIndexOf
//

}