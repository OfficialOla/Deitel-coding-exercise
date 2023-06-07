package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Olayinka", 0.00);
        Account account2 = new Account ("Fola", 0.00);
        System.out.printf("Account name is %s and balance is %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("Account name is %s and balance is %.0f%n", account2.getName(), account2.getBalance());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount for Olayinka's account: ");
        double depositAmount = scanner.nextDouble();
        System.out.printf("%n adding %.2f to account1 balance %n%n", depositAmount);
        account1.deposit(depositAmount);
        System.out.println("Enter transfer amount into Fola's account: ");
          double transferAmount = scanner.nextDouble();
          account1.withdrawal(transferAmount);
//         double withdrawalAmount = account1.getBalance() - transferAmount;
        System.out.printf("%n Transfering %.2f to Fola's balance %n%n", transferAmount);
        account2.deposit(transferAmount);
//        account2.transfer(transferAmount);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
        System.out.println("Transfer Successful...\nThank you for using our service.");
    }
}