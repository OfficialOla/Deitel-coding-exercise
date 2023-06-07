package chapterSeven;

import chapterThree.Account;

public class PassByValueOnAcc {
    public static void main(String[] args) {
        Account account = new Account("Felix", 5.00);
        System.out.println("account before squareAccountBalance: "+account.getBalance());
        squareAccountBalance(account);
        System.out.println("account after squareAccountBalance: "+account);
    }
    private static void squareAccountBalance(Account account){
        account.setBalance(account.getBalance()*account.getBalance());
    }
}
