package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void turnOn() {
//        Given that i have an Ac
        AirConditioner myAc = new AirConditioner();
//        When i turned it on
        myAc.setOn(true);
//        Check if Ac is on
        assertEquals(true, myAc.getTurnOn());
    }

        @Test
public void turnOff() {
//            Given that I have an AC
        AirConditioner myAc = new AirConditioner();
//        Given that Ac is on
            myAc.setOn(true);
//        When i turned off
             myAc.setOff(false);
//        check that Ac is off
            assertEquals(false, myAc.getTurnOff());
    }
@Test
        public void increaseTemperatureTest() {
//    given that there is AC
AirConditioner myAc = new AirConditioner();
//    Given that Ac is on
    myAc.setOn(true);
// when i increase temperature
    myAc.increaseTemperature(true);
//    check that
}


}
