package breakSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTest {
    @Test
    void testForEvenPlace() {
        assertEquals(13, CreditCardValidatorMain.evenPlace("12394"));
    }
    @Test
    void checkPrefix() {
        assertEquals("American Express", CreditCardValidatorMain.prefixChecker("3778903748573647"));
    }
    @Test
    void visaCheck(){
        assertEquals("Visa Cards", CreditCardValidatorMain.prefixChecker("4778903748573647"));
    }

}