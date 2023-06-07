package BankApp;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    ArrayList <Account> accounts = new ArrayList<>();
    public void createAccountFor(String firstName, String lastName, String pin) {
        int accountNumber = accounts.size() + 1;
        Account myNewAccount = new Account(firstName + " " + lastName, accountNumber, pin);
        accounts.add(accountNumber - 1, myNewAccount);
    }
    public Account checkAccount(int accountNumber) {
        accountNumber = accountNumber - 1;
//        System.out.println(accounts.toString());
        return accounts.get(accountNumber);

    }
    public int checkforNumbersOfAccount() {
        return accounts.size();

    }
    public void depositInto(BigDecimal amount, int acctNumber) {
        Account account = checkAccount(acctNumber);
        account.deposit(amount);

    }

    public BigDecimal checkBalanceFor(int acctNumber, String pin) {
        Account accounts = checkAccount(acctNumber);
       return accounts.checkBalance(pin);
    }

    public void withdrawFrom(BigDecimal amount, int acctNumber, String pin) {
        Account accounts = checkAccount(acctNumber);
        accounts.withdrawal(amount, pin);
    }

    public void transfer(BigDecimal amount, int senderAcctNumber,  String pin, int receiverAccTNumber) {
        withdrawFrom(amount, senderAcctNumber, pin);
        depositInto(amount, receiverAccTNumber);
    }

    public void closeAccount(String firstName, String lastName, int acctNumber) {
        int del = acctNumber-1;
        accounts.remove(del);
//        Account myAcct = c
//        accounts.add(null);
        accounts.add(del, null);

    }
    public int getAccountNumber(String pin) {
        for (Account account: accounts) {
            if (account.getPin().equals(pin)) {
                return account.getAcctNumber();
            }
        }
        return 0;
    }
    public void checkAccountInfo(){

    }
}
