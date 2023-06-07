package breakSnacks;

import java.util.Scanner;

public class CreditCardValidatorMain {
    public static void main(String[] args) {

//        String creditCardNumber = "4388576018402626";
//        String creditCardNumber = "234319283049582";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter card number: ");
        String creditCardNumber = scanner.nextLine();

        System.out.println("Credit Card Type: " +prefixChecker(creditCardNumber));
        System.out.println("Credit Card Number: " +creditCardNumber);
        System.out.println("Credit Card Digit Length: " +creditCardNumber.length());
        validator(creditCardNumber);
    }
    private static void validator(String creditCardNumber) {
        int result = oddPlace(creditCardNumber) + evenPlace(creditCardNumber);
        if (result % 10 == 0) {
            System.out.println("Credit Card Validity Status: Valid ");
        } else {
            System.out.println("Credit Card Validity Status: Invalid ");
        }
    }

    public static int evenPlace(String creditCardNumber) {

        int count = creditCardNumber.length() - 2;
        int total = 0;
        while (count >= 0) {
            char ch = creditCardNumber.charAt(count);
            String n = String.valueOf(ch);
            int o = Integer.parseInt(n);
            int newNum = o * 2;
            if (newNum > 9) {
                newNum = newNum % 10 + newNum / 10;
            }
            total += newNum;
            count = count - 2;
        }
        return total;
    }
    public static int oddPlace(String creditCardNumber) {
        int count = creditCardNumber.length() - 1;
        int total = 0;
        while (count >= 0) {
            char ch = creditCardNumber.charAt(count);
            String n = String.valueOf(ch);
            int newNum = Integer.parseInt(n);
            total += newNum;
            count = count - 2;
        }
        return total;
    }

    public static String prefixChecker(String creditCardNumber) {
        int result = oddPlace(creditCardNumber) + evenPlace(creditCardNumber);
        if (result % 10 == 0 && creditCardNumber.charAt(0) == '3' && creditCardNumber.charAt(1) == '7' && creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16){
            return String.format("%s", "American Express");
        } else if (result % 10 == 0 && creditCardNumber.charAt(0) == '4' && creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16) {
            return "Visa Cards";
        } else if (result % 10 == 0 && creditCardNumber.charAt(0) == '5' && creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16) {
            return "MasterCard";
        } else if (result % 10 == 0 && creditCardNumber.charAt(0) == '6' && creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16) {
            return "Discover Cards";
        } else return "Invalid card";
    }
}