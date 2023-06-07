package chapterThree;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    public double withdrawal(double transferAmount){
        if (balance >= transferAmount) {
        balance = balance - transferAmount;}
        if (balance < transferAmount);
        return balance;
    }
    public double transfer(double moneyTransfered){
        if (balance >= moneyTransfered) {
            balance = balance - moneyTransfered;}
        if (balance < moneyTransfered);
    return 0.00;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }


}

