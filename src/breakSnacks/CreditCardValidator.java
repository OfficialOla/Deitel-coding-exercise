package breakSnacks;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter card number: ");
        String number = scanner.nextLine();
        validator(number);

    }
    public static int evenPlace(String number){
        int count = number.length() - 2;
        int total = 0;
        while (count >= 0){
            char ch = number.charAt(count);
            String c = String.valueOf(ch);
            int o = Integer.parseInt(c);
            int newNum = o * 2;
            if (newNum > 9) {
                newNum = newNum % 10 + newNum / 10;
            }
                total += newNum;
                count -= 2;
            }
        return total;
    }

    public static int oddPlace(String number) {
        int count = number.length() - 1;
        int total = 0;
        while (count >= 0) {
            char ch = number.charAt(count);
            String c = String.valueOf(ch);
            int newNum = Integer.parseInt(c);
            total += newNum;
            count -= 2;
        }
        return total;
    }
    public static void validator(String number) {
        int result = oddPlace(number) + evenPlace(number);
        if (result % 10 == 0){
            System.out.println("Card is valid");
        }else System.out.println("Card is invalid");
    }

    }


