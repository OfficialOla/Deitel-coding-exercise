package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HekkaParcelsTest {
    @Test
    public void firstSet() {
        //given that I have a parcel
        HekkaParcels hekkaP = new HekkaParcels();
        // when the 50 - 59 parcels is delivered
       int bonus = hekkaP.totalParcelDelivered1(50, 200);
        // assert that the bonus is #200
        assertEquals(10000, bonus);
    }
    @Test
    public void secondSet() {
        HekkaParcels hekkaP = new HekkaParcels();
        int bonus = hekkaP.totalParcelDelivered2(60, 250);
        assertEquals(15000, bonus);
    }
    @Test
    public void thirdSet() {
        HekkaParcels hekkaP = new HekkaParcels();
        int bonus = hekkaP.totalParcelDelivered3(71, 500);
        assertEquals(35500, bonus);
    }

}