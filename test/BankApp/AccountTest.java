package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {
    private Account myAccount;
    @BeforeEach
    public void setUp(){
        myAccount = new Account("Joshua", 1, "1234");
    }
    @Test
    public void testThatIHaveAnAccount(){
        myAccount.setAcctName("Joshua");
        assertEquals("Joshua", myAccount.getName());
    }
    @Test
    public void testThatICanDeposit(){
        myAccount.deposit(BigDecimal.valueOf(5000));
        assertEquals(BigDecimal.valueOf(5000), myAccount.checkBalance("1234"));
    }
    @Test
    public void testThatICanWithdraw(){
        myAccount.deposit(BigDecimal.valueOf(10000));
        myAccount.withdrawal(BigDecimal.valueOf(5000), "1234");
        assertEquals(BigDecimal.valueOf(5000), myAccount.checkBalance("1234"));
    }
    @Test
    public void testThatICanWithdrawWithAWrongPin() {
        myAccount.deposit(BigDecimal.valueOf(10000));
        assertThrows(IllegalArgumentException.class, ()-> myAccount.withdrawal(BigDecimal.valueOf(2000), "1235"));
    }
    @Test
    public void testThatICantWithdrawAboveBalance(){
        myAccount.deposit(BigDecimal.valueOf(5000));
//        myAccount.withdrawal(BigDecimal.valueOf(4000), "1234");
//        assertEquals(BigDecimal.valueOf(1000), myAccount.checkBalance("1234"));
        assertThrows(IllegalArgumentException.class, ()-> myAccount.withdrawal(BigDecimal.valueOf(6000), "1234"));
    }

}