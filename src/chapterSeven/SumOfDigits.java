package chapterSeven;

import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a four-digit integer: ");
        int userInput = scanner.nextInt();
        SumOfDigits.sumOf(userInput);


    }
    public static void sumOf(int number) {

        int number1 = number / 1000;
        int number2 = number % 1000;
        int number3 = number % 100;
        int number4 = number2 / 100;
        int number5 = number2 % 10;
        int number6 = number3 / 10;
        int sum = number1 + number4 + number6 + number5;
        System.out.println(sum);

    }
    }

