package BankApp;


import javax.swing.*;
        import java.math.BigDecimal;
        import java.util.Scanner;

public class ATMMachine {
    private static Scanner keyboardInputCollector = new Scanner(System.in);
    private static Bank gtbank = new Bank();
    public static void main(String[] args) {
        gotoMainMenu();
    }

    private static void gotoMainMenu() {
        String mainMenu = """
            =========================
            Welcome to GTB Bank
            1 -> Create Account
            2 -> Deposit
            3 -> Withdraw
            4 -> Transfer
            5 -> Check Balance
            6 -> Close Account
            7 -> Exit
      """;
        String userInput = input(mainMenu);
        switch(userInput.charAt(0)){
            case '1'-> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> checkBalance();
            case '6' -> closeAccount();
            case '7' -> exitApplication();
            default -> gotoMainMenu();
        }
    }

    private static void exitApplication() {
        display("Thank you for using our application");
        System.exit(1);
    }

    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        String pin = input("Enter your Pin");
        String accountBalance =String.format( """
//    Your account balance is %s
//				""", gtbank.checkBalanceFor(accountNumber, pin).toPlainString());
        display(accountBalance);
        gotoMainMenu();
    }
    private static void transfer() {
        int senderAccountNumber = Integer.parseInt(input("Enter your account number"));
        int receiverAccountNumber = Integer.parseInt(input("Enter your receiver account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        String senderPin = input("Enter your Pin");
        try {
            gtbank.transfer(amount, senderAccountNumber, senderPin, receiverAccountNumber);
        }
        catch (IllegalArgumentException error){
            display(error.getMessage());
            transfer();
        }

        gotoMainMenu();
    }

    private static void withdraw() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        String pin = input("Enter your Pin");
        try {
            gtbank.withdrawFrom(amount, accountNumber, pin);
        }
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            withdraw();
        }

        gotoMainMenu();
    }

    private static void deposit() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        gtbank.depositInto(amount, accountNumber);
        display("Deposited successfully");
        gotoMainMenu();
    }

    private static void createAccount() {
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");
        String pin = input("Enter your pin");
        gtbank.createAccountFor(firstName, lastName, pin);
        display("Account created successfully");
        gotoMainMenu();
    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
//		display(prompt);
//		return keyboardInputCollector.nextLine();

    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
//		System.out.println(prompt);
    }
    public static  void closeAccount(){
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");
        String accountNumber = input("Enter your account number");
        gtbank.closeAccount(firstName, lastName, Integer.parseInt(accountNumber));
        display("Account successfully closed");
        gotoMainMenu();
    }
}