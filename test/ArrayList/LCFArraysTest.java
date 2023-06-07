package ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCFArraysTest {



    @Test
    public void testLCF(){
     int[] arr = LCFArrays.findLCF(10);
     int[] result = {2,5};
     assertArrayEquals(result, arr);


    }

}