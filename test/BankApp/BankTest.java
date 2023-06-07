package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank myBank;
    @BeforeEach
    public void setUp(){
        myBank = new Bank ();
    }

    @Test
    public void testNumberOfAccounts(){
        myBank.createAccountFor("Josh", "Kuse", "1244");
        myBank.createAccountFor("Remi", "Felix", "1244");
        myBank.createAccountFor("John", "Spencer", "1244");
        myBank.createAccountFor("James", "Idan", "1244");
        myBank.createAccountFor("Malik", "Zainab", "1244");
        System.out.println(myBank.checkAccount(2).toString());
        assertEquals(5, myBank.checkforNumbersOfAccount());
    }

    @Test
    public void testThatAccountIsCreated(){
        myBank.createAccountFor("Josh", "Kuse", "1244");
        String info = """
                1. Account name: Josh Kuse
                2. Account number: 1
                3. Account balance: 0""";

        assertEquals(info, myBank.checkAccount(1).toString());
    }
    @Test
    public void testThatMoneyWasDeposited(){
        myBank.createAccountFor("Josh", "Kuse", "1244");
        myBank.depositInto(BigDecimal.valueOf(5000), 1);
        assertEquals(BigDecimal.valueOf(5000), myBank.checkBalanceFor(1, "1244"));
    }
    @Test
    public void testThatMoneyCanBeWithdrawn(){
        myBank.createAccountFor("Maxwell", "Josh", "1234");
        myBank.depositInto(BigDecimal.valueOf(6000), 1);
        myBank.withdrawFrom(BigDecimal.valueOf(2000),  1, "1234");
        assertEquals(BigDecimal.valueOf(4000), myBank.checkBalanceFor(1, "1234"));
    }
    @Test
    public void testThatMoneyCanBeTransferred(){
        myBank.createAccountFor("Josh", "Kuse", "1234");
        myBank.createAccountFor("Maxwell", "Josh", "1222");
        myBank.depositInto(BigDecimal.valueOf(10000), 1);
        myBank.transfer(BigDecimal.valueOf(5000), 1,"1234", 2);
        assertEquals(BigDecimal.valueOf(5000), myBank.checkBalanceFor(2, "1222"));
    }
    @Test
    public void testThatAccountCanBeClosed(){
        myBank.createAccountFor("Josh", "Kuse", "1234");
        myBank.createAccountFor("Maxwell", "Josh", "1222");
//        myBank.createAccountFor("Josh", "Kuse", "1234");
        myBank.closeAccount("Josh", "kuse", 2);
//        myBank.createAccountFor("Maxwell", "Josh", "1222");
        System.out.println(myBank.toString());
        assertEquals(null, myBank.checkAccount(2));
    }

    @Test
    public void accountNumberTest() {
        myBank.createAccountFor("John", "Mark", "1234");
        myBank.createAccountFor("Mary", "Mark", "5678");
        myBank.createAccountFor("Luke", "Mark", "6543");
        int accountNumber = myBank.getAccountNumber("1234");
        assertEquals(1, accountNumber);

        int accountNumber3 = myBank.getAccountNumber("6543");
        assertEquals(3, accountNumber3);


    }

    @Test
    public void checkAccountTest() {
        myBank.createAccountFor("John", "Mark", "1234");

        Account account = myBank.checkAccount(1);

        assertEquals("John Mark" , account.getName());
        assertEquals("1234", account.getPin());

    }

}