package BankApp;

import java.math.BigDecimal;

public class Account {
    private String acctName;

    private int acctNumber;
    private BigDecimal balance;
    private String pin;

    public Account(String acctName, int acctNumber, String pin) {
        this.acctName = acctName;
        this.acctNumber = acctNumber;
        this.balance = BigDecimal.ZERO;
        this.pin = pin;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getName() {
    return acctName;
    }

    public BigDecimal checkBalance(String pin) {
        validate(pin);
        return balance;
    }

    public void deposit(BigDecimal amount) {
        this.balance = balance.add(amount);
    }

    public void withdrawal(BigDecimal amount, String pin) {
        var result = balance.compareTo(amount);
        validate(pin);
        this.pin = pin;
        if (result < 0) throw new IllegalArgumentException("Insufficient Fund");
        this.balance = balance.subtract(amount);


    }

    private void validate(String pin) {
        if (!this.pin.equals(pin)) throw new IllegalArgumentException("You dey mad, you wan scam me! ");
    }
    public String toString(){
       return String.format("""
                1. Account name: %s
                2. Account number: %s
                3. Account balance: %s""",
         acctName, acctNumber, balance);
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public String getPin() {
        return pin;
    }
}
