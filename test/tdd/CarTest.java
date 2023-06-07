package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
    public void testThatCarCanBeCreated() {
//        given that car can be created
//          when i create a car
//        check that a car has been created
        Car benz = new Car("G-990", "2022", 50.00);
        assertNotNull(benz);
    }
    @Test
    public void testThatCarAttributesAreProperlyInitialised(){
        Car benz = new Car("G-990", "2022", 50.00);
        assertEquals("G-990", benz.getModel());
        assertEquals("2022", benz.getYear());
        assertEquals(50.00, benz.getPrice());
    }
    @Test
    public void testThatOnlyPositiveAmountAreAllowedAsCarPrice() {
        Car benz = new Car("G-990", "2022", 50.00);
        benz.setPrice(-20000);
        assertEquals(50.00, benz.getPrice());
    }
    @Test
    public void testDiscount(){
        Car bmw = new Car("A5", "2021", 3000000.00);
        bmw.applyDiscount(10);
        assertEquals(2700000.00, bmw.getPrice());
    }
    @Test
    public void testDiscount2(){
        Car toyota = new Car("Camry", "2021", 5000000.00);
        toyota.applyDiscount(7);
        assertEquals(4650000, toyota.getPrice());
    }
}
