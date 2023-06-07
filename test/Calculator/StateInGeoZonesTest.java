package Calculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StateInGeoZonesTest {

    @Test
            public void TestStateInGeo(){
    StateInGeoZones myState = new StateInGeoZones();
//    GeopoliticalZones state = myState.stateFinder("ANAMBRA");
        //myState.setZone("Kaduna");
        //assertNotNull(myState.getZone());

      //  assertEquals(GeopoliticalZones.NORTHCENTRAL, myState.stateFinder("Kwara") );
        GeopoliticalZones.stateFinder("Osun");



    }
    @Test
    public void getStateTest(){
        GeopoliticalZones[] states = GeopoliticalZones.values();
        for (GeopoliticalZones TheStates : states){
            System.out.println(Arrays.toString(TheStates.getState()));


            }
        }
    }

